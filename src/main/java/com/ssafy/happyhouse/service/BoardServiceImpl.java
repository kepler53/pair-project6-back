package com.ssafy.happyhouse.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.happyhouse.dto.BoardDto;
import com.ssafy.happyhouse.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private SqlSessionTemplate template;
	

	@Override
	public List<BoardDto> getBoardList() {
		// TODO Auto-generated method stub
		return template.getMapper(BoardMapper.class).getBoardList();
	}

	@Override
	public int addBoard(BoardDto boardDto) {
		return template.getMapper(BoardMapper.class).addBoard(boardDto);
	}

	@Override
	public int deleteBoard(String boardnum) {
		// TODO Auto-generated method stub
		return template.getMapper(BoardMapper.class).deleteBoard(boardnum);
	}

	@Override
	public int updateBoard(BoardDto boardDto) {
		// TODO Auto-generated method stub
		return template.getMapper(BoardMapper.class).updateBoard(boardDto);
	}

	@Override
	public BoardDto selectBoard(String boardnum) {
		
		BoardDto board = template.getMapper(BoardMapper.class).selectBoard(boardnum);
		board.setBoard_count(board.getBoard_count()+1);
		return board;
	}

}
