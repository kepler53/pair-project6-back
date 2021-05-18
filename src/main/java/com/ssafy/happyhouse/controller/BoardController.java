package com.ssafy.happyhouse.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.happyhouse.dto.BoardDto;
import com.ssafy.happyhouse.service.BoardService;

@RestController
@RequestMapping("/board")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private BoardService bservice;
	
	@GetMapping(value ="/list", produces = "application/json")
	public List<BoardDto> getBoardList(){
		
		List<BoardDto> blist = bservice.getBoardList();
		if(blist==null) {
			return null;
		}else {
			return blist;
		}
	}
	
	@PostMapping("/add")
	public String addBoard(@RequestBody BoardDto boardDto) {
		int result = bservice.addBoard(boardDto);
		
		if(result > 0) {
			return "success";
		}else {
			return "fail";
		}
	}
	
	
}
