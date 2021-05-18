package com.ssafy.happyhouse.service;

import java.util.List;

import com.ssafy.happyhouse.dto.BoardDto;

public interface BoardService {

	public List<BoardDto> getBoardList();
	public int addBoard(BoardDto boardDto);
	public int deleteBoard(String boardnum);
	public int updateBoard(BoardDto boardDto);
	
	
}
