package com.ssafy.happyhouse.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.happyhouse.dto.BoardDto;
import com.ssafy.happyhouse.dto.CommentDto;
import com.ssafy.happyhouse.mapper.BoardMapper;
import com.ssafy.happyhouse.mapper.CommentMapper;

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
		int result = template.getMapper(BoardMapper.class).updateCount(boardnum);
//		System.out.println(result);
		BoardDto board = template.getMapper(BoardMapper.class).selectBoard(boardnum);
		return board;
	}

	@Override
	public List<CommentDto> getCmtList(String bnum) {
		List<CommentDto> cList = template.getMapper(CommentMapper.class).getCmtList(bnum);
		return cList;
	}

	@Override
	public int addCmt(CommentDto comment) {
		int result = template.getMapper(CommentMapper.class).addCmt(comment);
		return result;
	}

	@Override
	public int deleteCmt(String cnum) {
		int result = template.getMapper(CommentMapper.class).deleteCmt(cnum);
		return result;
	}

	@Override
	public int updateCmt(CommentDto comment) {
		int result = template.getMapper(CommentMapper.class).updateCmt(comment);
		return result;
	}
	
	

}
