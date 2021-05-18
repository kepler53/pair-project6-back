package com.ssafy.happyhouse.dto;

import java.util.Date;

public class CommentDto {


	public int getComment_no() {
		return comment_no;
	}
	public void setComment_no(int comment_no) {
		this.comment_no = comment_no;
	}
	public String getComment_content() {
		return comment_content;
	}
	public void setComment_content(String comment_content) {
		this.comment_content = comment_content;
	}
	public CommentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBoard_no() {
		return board_no;
	}
	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}
	public Date getComment_regdate() {
		return comment_regdate;
	}
	public CommentDto(int comment_no, String comment_content, int board_no, Date comment_regdate) {
		super();
		this.comment_no = comment_no;
		this.comment_content = comment_content;
		this.board_no = board_no;
		this.comment_regdate = comment_regdate;
	}
	@Override
	public String toString() {
		return "CommentDto [comment_no=" + comment_no + ", comment_content=" + comment_content + ", board_no="
				+ board_no + ", comment_regdate=" + comment_regdate + "]";
	}
	public void setComment_regdate(Date comment_regdate) {
		this.comment_regdate = comment_regdate;
	}
	private int comment_no;
	private String comment_content;
	private int board_no;
	private Date comment_regdate;
}
