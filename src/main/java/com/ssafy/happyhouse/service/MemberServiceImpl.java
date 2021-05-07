package com.ssafy.happyhouse.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.happyhouse.dto.MemberDto;
import com.ssafy.happyhouse.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private SqlSessionTemplate template;
	
	@Override
	public int addMember(MemberDto member) {
		
		return template.getMapper(MemberMapper.class).addMember(member);
	}

	@Override
	public int updateMember(MemberDto member) {
		return template.getMapper(MemberMapper.class).updateMember(member);
	}

	@Override
	public int deleteMember(MemberDto member) {
		// TODO Auto-generated method stub
		return template.getMapper(MemberMapper.class).deleteMember(member);
	}

	@Override
	public MemberDto login(MemberDto member) {
		// TODO Auto-generated method stub
		return template.getMapper(MemberMapper.class).login(member);
	}

}
