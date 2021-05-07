package com.ssafy.happyhouse.dto;

import org.springframework.stereotype.Repository;

@Repository
public class HouseDealDto {
	
	
	private int no;
	private String dong;
	private String aptName;
	private String code;
	private String dealAmount;
	private String buildYear;
	private String dealYear;
	private String area;
	private String floor;
	private String jibun;
	private String type;
	private String rentMoney;
	private FileInfoDto fileinfo;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	public String getAptName() {
		return aptName;
	}
	public void setAptName(String aptName) {
		this.aptName = aptName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDealAmount() {
		return dealAmount;
	}
	public void setDealAmount(String dealAmount) {
		this.dealAmount = dealAmount;
	}
	public String getBuildYear() {
		return buildYear;
	}
	public void setBuildYear(String buildYear) {
		this.buildYear = buildYear;
	}
	public String getDealYear() {
		return dealYear;
	}
	public void setDealYear(String dealYear) {
		this.dealYear = dealYear;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getJibun() {
		return jibun;
	}
	public void setJibun(String jibun) {
		this.jibun = jibun;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRentMoney() {
		return rentMoney;
	}
	public void setRentMoney(String rentMoney) {
		this.rentMoney = rentMoney;
	}
	public FileInfoDto getFileinfo() {
		return fileinfo;
	}
	public void setFileinfo(FileInfoDto fileinfo) {
		this.fileinfo = fileinfo;
	}
	@Override
	public String toString() {
		return "HouseDealDto [no=" + no + ", dong=" + dong + ", aptName=" + aptName + ", code=" + code + ", dealAmount="
				+ dealAmount + ", buildYear=" + buildYear + ", dealYear=" + dealYear + ", area=" + area + ", floor="
				+ floor + ", jibun=" + jibun + ", type=" + type + ", rentMoney=" + rentMoney + ", fileinfo=" + fileinfo
				+ "]";
	}
	public HouseDealDto(int no, String dong, String aptName, String code, String dealAmount, String buildYear,
			String dealYear, String area, String floor, String jibun, String type, String rentMoney,
			FileInfoDto fileinfo) {
		super();
		this.no = no;
		this.dong = dong;
		this.aptName = aptName;
		this.code = code;
		this.dealAmount = dealAmount;
		this.buildYear = buildYear;
		this.dealYear = dealYear;
		this.area = area;
		this.floor = floor;
		this.jibun = jibun;
		this.type = type;
		this.rentMoney = rentMoney;
		this.fileinfo = fileinfo;
	}
	public HouseDealDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
