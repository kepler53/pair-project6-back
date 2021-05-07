package com.ssafy.happyhouse.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.happyhouse.dto.FileInfoDto;
import com.ssafy.happyhouse.dto.HouseDealDto;
@Mapper
public interface HouseMapper {
	public List<HouseDealDto> search(String dongcode);
	
	public int add(HouseDealDto housedeal);
	public int fileRegist(FileInfoDto fileInfo);
	
}
