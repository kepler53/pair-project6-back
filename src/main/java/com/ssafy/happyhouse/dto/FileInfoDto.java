package com.ssafy.happyhouse.dto;

public class FileInfoDto {
	
	int fno;
	String savefolder;
	String originfile;
	String savefile;
	public int getFno() {
		return fno;
	}
	public void setFno(int fno) {
		this.fno = fno;
	}
	public String getSavefolder() {
		return savefolder;
	}
	public void setSavefolder(String savefolder) {
		this.savefolder = savefolder;
	}
	public String getOriginfile() {
		return originfile;
	}
	public void setOriginfile(String originfile) {
		this.originfile = originfile;
	}
	public String getSavefile() {
		return savefile;
	}
	public void setSavefile(String savefile) {
		this.savefile = savefile;
	}
	@Override
	public String toString() {
		return "FileInfoDto [fno=" + fno + ", savefolder=" + savefolder + ", originfile=" + originfile + ", savefile="
				+ savefile + "]";
	}
	
	

}
