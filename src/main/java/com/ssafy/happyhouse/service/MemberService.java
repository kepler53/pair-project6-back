package com.ssafy.happyhouse.service;

import com.ssafy.happyhouse.dto.MemberDto;

public interface MemberService {
	
	public int addMember(MemberDto member);
	public int updateMember(MemberDto member);
	public int deleteMember(MemberDto member);
	public MemberDto login(MemberDto member);

}
