package kr.co.toonie.mapper.vo;

import java.util.ArrayList;

public class TagInfoVo {
	
	private String toonTag;
	private ArrayList<ToonVo> toonInfoList;
	
	
	public String getToonTag() {
		return toonTag;
	}
	public void setToonTag(String toonTag) {
		this.toonTag = toonTag;
	}
	public ArrayList<ToonVo> getToonInfoList() {
		return toonInfoList;
	}
	public void setToonInfoList(ArrayList<ToonVo> toonInfoList) {
		this.toonInfoList = toonInfoList;
	}
	
	@Override
	public String toString() {
		return "TagInfoVo [tag=" + toonTag + ", toonInfoList=" + toonInfoList + "]";
	}
	
	
	
	
}
