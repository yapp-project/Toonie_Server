package kr.co.toonie.mapper.vo;

import java.util.ArrayList;

public class ToonVo {
	private String toonID;
	private String toonName;
	private String instaID;
	private String instaUrl;
	private String instaThumnailUrl;
	private String instaInfo;
	private String instafollowerCnt;
	private String instaPostCnt;
	private String instaLatestPostUrl;
	private ArrayList<String> toonTagList;
	private ArrayList<String> curationTagList;
	
	@Override
	public String toString() {
		return "ToonVo [toonID=" + toonID + ", toonName=" + toonName + ", instaID=" + instaID + ", instaUrl=" + instaUrl
				+ ", instaThumnailUrl=" + instaThumnailUrl + ", instaInfo=" + instaInfo + ", instafollowerCnt="
				+ instafollowerCnt + ", instaPostCnt=" + instaPostCnt + ", instaLatestPostUrl=" + instaLatestPostUrl
				+ ", toonTagList=" + toonTagList + ", curationTagList=" + curationTagList + "]";
	}
	
	public ArrayList<String> getToonTagList() {
		return toonTagList;
	}
	public void setToonTagList(ArrayList<String> toonTagList) {
		this.toonTagList = toonTagList;
	}
	public String getToonID() {
		return toonID;
	}
	public void setToonID(String toonID) {
		this.toonID = toonID;
	}
	public String getToonName() {
		return toonName;
	}
	public void setToonName(String toonName) {
		this.toonName = toonName;
	}
	public String getInstaID() {
		return instaID;
	}
	public void setInstaID(String instaID) {
		this.instaID = instaID;
	}
	public String getInstaUrl() {
		return instaUrl;
	}
	public void setInstaUrl(String instaUrl) {
		this.instaUrl = instaUrl;
	}
	public String getInstaThumnailUrl() {
		return instaThumnailUrl;
	}
	public void setInstaThumnailUrl(String instaThumnailUrl) {
		this.instaThumnailUrl = instaThumnailUrl;
	}
	public String getInstaInfo() {
		return instaInfo;
	}
	public void setInstaInfo(String instaInfo) {
		this.instaInfo = instaInfo;
	}
	public String getInstafollowerCnt() {
		return instafollowerCnt;
	}
	public void setInstafollowerCnt(String instafollowerCnt) {
		this.instafollowerCnt = instafollowerCnt;
	}
	public String getInstaPostCnt() {
		return instaPostCnt;
	}
	public void setInstaPostCnt(String instaPostCnt) {
		this.instaPostCnt = instaPostCnt;
	}
	public String getInstaLatestPostUrl() {
		return instaLatestPostUrl;
	}
	public void setInstaLatestPostUrl(String instaLatestPostUrl) {
		this.instaLatestPostUrl = instaLatestPostUrl;
	}
	public ArrayList<String> getCurationTagList() {
		return curationTagList;
	}
	public void setCurationTagList(ArrayList<String> curationTagList) {
		this.curationTagList = curationTagList;
	}
	
	
}
