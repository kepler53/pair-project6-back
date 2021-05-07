package com.ssafy.happyhouse.dto;


public class FileInfoDto {
	
	@Override
	public String toString() {
		return "FileInfoDto [no=" + no + ", fno=" + fno + ", saveFolder=" + saveFolder + ", originFile=" + originFile
				+ ", saveFile=" + saveFile + "]";
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getFno() {
		return fno;
	}
	public void setFno(int fno) {
		this.fno = fno;
	}
	public String getSaveFolder() {
		return saveFolder;
	}
	public void setSaveFolder(String saveFolder) {
		this.saveFolder = saveFolder;
	}
	public String getOriginFile() {
		return originFile;
	}
	public void setOriginFile(String originFile) {
		this.originFile = originFile;
	}
	public String getSaveFile() {
		return saveFile;
	}
	public void setSaveFile(String saveFile) {
		this.saveFile = saveFile;
	}
	private int no;
	private int fno;
	private String saveFolder;
	private String originFile;
	private String saveFile;

}
