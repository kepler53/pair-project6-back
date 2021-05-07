package com.ssafy.happyhouse.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.happyhouse.dto.HouseDealDto;
import com.ssafy.happyhouse.mapper.HouseMapper;

@Service
public class HouseServiceImpl implements HouseService {
	@Autowired
	private SqlSessionTemplate template;

	@Override
	public List<HouseDealDto> search(String dongcode) throws Exception {
		return template.getMapper(HouseMapper.class).search(dongcode);
	}
}
