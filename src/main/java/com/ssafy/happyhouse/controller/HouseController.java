package com.ssafy.happyhouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/house")
public class HouseController {
	
	@RequestMapping(value = "/regist", method = RequestMethod.GET)
	public String regist() {
		return "house/houseRegist";
	}
}