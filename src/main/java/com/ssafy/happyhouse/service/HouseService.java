package com.ssafy.happyhouse.service;

import java.util.List;

import com.ssafy.happyhouse.dto.HouseDealDto;

public interface HouseService {
	// 동 코드에 맞는 정보 검색
	public List<HouseDealDto> search(String dongcode) throws Exception;
}
