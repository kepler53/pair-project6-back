package com.ssafy.happyhouse.dto;

import java.util.Date;

import org.springframework.stereotype.Repository;

@Repository
public class BoardDto {
	


	@Override
	public String toString() {
		return "BoardDto [board_no=" + board_no + ", board_title=" + board_title + ", board_content=" + board_content
				+ ", board_count=" + board_count + ", board_check=" + board_check + ", board_regdate=" + board_regdate
				+ "]";
	}
	public BoardDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BoardDto(int board_no, String board_title, String board_content, int board_count, String board_check,
			Date board_regdate) {
		super();
		this.board_no = board_no;
		this.board_title = board_title;
		this.board_content = board_content;
		this.board_count = board_count;
		this.board_check = board_check;
		this.board_regdate = board_regdate;
	}
	public int getBoard_no() {
		return board_no;
	}
	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}
	public String getBoard_title() {
		return board_title;
	}
	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	public int getBoard_count() {
		return board_count;
	}
	public void setBoard_count(int board_count) {
		this.board_count = board_count;
	}
	public String getBoard_check() {
		return board_check;
	}
	public void setBoard_check(String board_check) {
		this.board_check = board_check;
	}
	public Date getBoard_regdate() {
		return board_regdate;
	}
	public void setBoard_regdate(Date board_regdate) {
		this.board_regdate = board_regdate;
	}
	private int board_no;
	private String board_title;
	private String board_content;
	private int board_count;
	private String board_check;
	private Date board_regdate;
	
	
	
	
}
