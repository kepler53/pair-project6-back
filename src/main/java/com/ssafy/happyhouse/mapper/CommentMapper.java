package com.ssafy.happyhouse.mapper;

import java.util.List;

import com.ssafy.happyhouse.dto.CommentDto;

public interface CommentMapper {

	public List<CommentDto> getCmtList(String bnum);
	
	public int addCmt(CommentDto comment);
	public int deleteCmt(String num);
	public int updateCmt(CommentDto comment);
	
}
