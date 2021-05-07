package com.ssafy.happyhouse.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ssafy.happyhouse.dto.FileInfoDto;
import com.ssafy.happyhouse.dto.HouseDealDto;
import com.ssafy.happyhouse.service.HouseService;


@Controller
@RequestMapping("/house")
public class HouseController {
	
	private static final Logger logger = LoggerFactory.getLogger(HouseController.class);

	
	@Autowired
	private HouseService hservice;
	
	@Autowired
	ServletContext servletContext;
	

	@RequestMapping(value = "/regist", method = RequestMethod.GET)
	public String regist() {
		return "house/houseRegist";
	}
	
	@RequestMapping(value = "/search/{dongcode}", method = RequestMethod.GET)
	public ModelAndView search(@PathVariable(value="dongcode") String dongcode) throws Exception {
		System.out.println(dongcode);
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("houseList", hservice.search(dongcode));
		return mav;
	}
	
	@RequestMapping(value = "/regist", method = RequestMethod.POST)
	public String regist(HouseDealDto housedealDto, Model model, @RequestParam(value = "img") MultipartFile file) throws IllegalStateException, IOException {
		
//		System.out.println(housedealDto);
//		System.out.println(file);
//		System.out.println(file.isEmpty());
		if(!file.isEmpty()) {
			String realPath = servletContext.getRealPath("/resources/img");
			String today = new SimpleDateFormat("yyMMdd").format(new Date());
			String saveFolder = realPath + File.separator + today;
			System.out.println(saveFolder);
			logger.debug("오늘은 : {}", today);
			logger.debug(" 폴더 : {}", saveFolder);
			File folder = new File(saveFolder);
			if(!folder.exists()) {
				folder.mkdirs();
			}
			FileInfoDto fileInfoDto = new FileInfoDto();
			String originalFileName = file.getOriginalFilename();
			if (!originalFileName.isEmpty()) {
				String saveFileName = UUID.randomUUID().toString() + originalFileName.substring(originalFileName.lastIndexOf('.'));
				fileInfoDto.setSaveFolder(today);
				fileInfoDto.setOriginFile(originalFileName);;
				fileInfoDto.setSaveFile(saveFileName);
				logger.debug("원본 파일 이름 : {}, 실제 저장 파일 이름 : {}", file.getOriginalFilename(), saveFileName);
				file.transferTo(new File(folder, saveFileName));
			}
			housedealDto.setFileinfo(fileInfoDto);
		}
		
		int result = hservice.add(housedealDto);
		
		logger.debug("결과는 :{}",result);
		
		return "index";
		
		
	}
}