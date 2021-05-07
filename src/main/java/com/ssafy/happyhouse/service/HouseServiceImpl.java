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

	@Override
	public int add(HouseDealDto housedeal) {
		int result = template.getMapper(HouseMapper.class).add(housedeal);
		System.out.println(housedeal.getFileinfo());
		housedeal.getFileinfo().setNo(housedeal.getNo());
		int result2 = template.getMapper(HouseMapper.class).fileRegist(housedeal.getFileinfo());
		
		if(result==1&& result2==1) {
			return 1;
		}else {
			return 0;
		}
	}


}
