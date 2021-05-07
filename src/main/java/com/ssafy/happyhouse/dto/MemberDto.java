package com.ssafy.happyhouse.dto;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDto {
	
	String userid;
	String userpwd;
	String useremail;
	
	
	public MemberDto() {

	}
	public MemberDto(String userid, String userpwd, String useremail) {

		this.userid = userid;
		this.userpwd = userpwd;
		this.useremail = useremail;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	
	@Override
	public String toString() {
		return "MemberDto [userid=" + userid + ", userpwd=" + userpwd + ", useremail=" + useremail + "]";
	}
}
