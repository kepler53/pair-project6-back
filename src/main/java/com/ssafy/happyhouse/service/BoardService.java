package com.ssafy.happyhouse.service;

import java.util.List;

import com.ssafy.happyhouse.dto.BoardDto;
import com.ssafy.happyhouse.dto.CommentDto;

public interface BoardService {

	public List<BoardDto> getBoardList();
	public int addBoard(BoardDto boardDto);
	public int deleteBoard(String boardnum);
	public int updateBoard(BoardDto boardDto);
	public BoardDto selectBoard(String boardnum);
	
	public List<CommentDto> getCmtList(String bnum);
	public int addCmt(CommentDto comment);
	public int deleteCmt(String cnum);
	public int updateCmt(CommentDto comment);
}
