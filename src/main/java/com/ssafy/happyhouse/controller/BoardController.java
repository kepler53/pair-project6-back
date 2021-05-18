package com.ssafy.happyhouse.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.happyhouse.dto.BoardDto;
import com.ssafy.happyhouse.service.BoardService;

@CrossOrigin("*")
@RestController
@RequestMapping("/board")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private BoardService bservice;
	
	@GetMapping("")
	public List<BoardDto> getBoardList(){
		
		List<BoardDto> blist = bservice.getBoardList();
		if(blist==null) {
			return null;
		}else {
			return blist;
		}
	}
	
	@PostMapping("")
	public String addBoard(@CookieValue("loginCookie")String loginId,@RequestBody BoardDto boardDto) {
		int result = bservice.addBoard(boardDto);
		
		if(result > 0) {
			return "success";
		}else {
			return "fail";
		}
	}
	
	@PutMapping("")
	public String updateBoard(@RequestBody BoardDto boardDto) {
		int result = bservice.updateBoard(boardDto);
		
		if(result > 0) {
			return "success";
		}else {
			return "fail";
		}
	}
	
	@DeleteMapping("/{board_no}")
	public String deleteBoard(@PathVariable("board_no") String num) {
		int result = bservice.deleteBoard(num);
		
		if(result > 0) {
			return "success";
		}else {
			return "fail";
		}
	}
	
	@GetMapping("/{board_no}")
	public BoardDto selectBoard(@PathVariable("board_no") String num) {
		
		BoardDto board = bservice.selectBoard(num);
		
		if(board==null) {
			return null;
		}else {
			return board;
		}
	}
	
}
