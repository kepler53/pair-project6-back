package com.ssafy.happyhouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.happyhouse.dto.CommentDto;
import com.ssafy.happyhouse.service.BoardService;

@CrossOrigin("*")
@RestController
@RequestMapping("comment")
public class CommentController {

	@Autowired
	private BoardService bservice;
	
	@GetMapping("/{board_num}")
	public List<CommentDto> getCmtList(String bnum){
		List<CommentDto> cList = bservice.getCmtList(bnum);
		return cList;
	}
	
	@PostMapping("")
	public String addCmt(@RequestBody CommentDto comment) {
		int result = bservice.addCmt(comment);
		if(result >0) {
			return "success";
		}else {
			return "fail";
		}
	}
	
	@PutMapping("")
	public String updateCmt(@RequestBody CommentDto comment) {
		int result = bservice.updateCmt(comment);
		if(result >0) {
			return "success";
		}else {
			return "fail";
		}
	}
	
	@DeleteMapping("{comment_num}")
	public String delete(@PathVariable("comment_num") String cnum){
		
		int result = bservice.deleteCmt(cnum);
		if(result >0) {
			return "success";
		}else {
			return "fail";
		}
	}
	
	
	
}
