package com.ssafy.happyhouse.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssafy.happyhouse.dto.HouseDealDto;
import com.ssafy.happyhouse.service.HouseService;

@Controller
@RequestMapping("/house")
public class HouseController {
	@Autowired
	private HouseService hservice;

	@RequestMapping(value = "/regist", method = RequestMethod.GET)
	public String regist() {
		return "house/houseRegist";
	}
	
	@RequestMapping(value = "/search/{dongcode}", method = RequestMethod.GET)
	public ModelAndView search(@PathVariable(value="dongcode") String dongcode) throws Exception {
		System.out.println(dongcode);
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("houseList", hservice.search(dongcode));
		return mav;
	}
}