package com.ssafy.happyhouse.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.happyhouse.dto.MemberDto;

@Mapper
public interface MemberMapper {

	public int addMember(MemberDto member);
	public int deleteMember(MemberDto member);
	public int updateMember(MemberDto member);
	public MemberDto login(MemberDto member);
	
}
