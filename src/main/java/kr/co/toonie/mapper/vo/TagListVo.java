package kr.co.toonie.mapper.vo;

import java.util.ArrayList;

public class TagListVo {
	private boolean succeess;
	private ArrayList<String> tagList;
	private ArrayList<String> curationTagList;
	
	public boolean isSucceess() {
		return succeess;
	}
	public void setSucceess(boolean succeess) {
		this.succeess = succeess;
	}
	public ArrayList<String> getTagList() {
		return tagList;
	}
	public void setTagList(ArrayList<String> tagList) {
		this.tagList = tagList;
	}
	@Override
	public String toString() {
		return "TagListVo [succeess=" + succeess + ", tagList=" + tagList + "]";
	}
	public ArrayList<String> getCurationTagList() {
		return curationTagList;
	}
	public void setCurationTagList(ArrayList<String> curationTagList) {
		this.curationTagList = curationTagList;
	}
	
	
	
}
