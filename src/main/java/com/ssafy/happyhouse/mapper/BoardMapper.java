package com.ssafy.happyhouse.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.happyhouse.dto.BoardDto;
@Mapper
public interface BoardMapper {
	
	public List<BoardDto> getBoardList();
	public int addBoard(BoardDto boardDto);
	public int deleteBoard(String boardnum);
	public int updateBoard(BoardDto boardDto);
	public BoardDto selectBoard(String boardnum);
	public int updateCount(String boardnum);
}
