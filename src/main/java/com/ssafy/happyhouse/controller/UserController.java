package com.ssafy.happyhouse.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssafy.happyhouse.dto.MemberDto;
import com.ssafy.happyhouse.service.MemberService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private MemberService mservice;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		
		return "user/login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(MemberDto member, HttpSession session) {
		
		MemberDto loginInfo = mservice.login(member);
		if (loginInfo != null) {
			session.setAttribute("userinfo", loginInfo);
			return "index";
		}else {
			
			return "user/login";
		}
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		return "user/join";
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(MemberDto member,@RequestParam(value = "email") String emailEnd) {
		member.setUseremail(member.getUseremail()+"@"+emailEnd);
		int result = mservice.addMember(member);
		
		if(result>0) {
			return "index";
		}else {
			return "user/join";
		}
	}
	
	@RequestMapping(value = "/mypage", method = RequestMethod.GET)
	public String mypage() {
		return "user/mypage";
	}
	
	
	
}
