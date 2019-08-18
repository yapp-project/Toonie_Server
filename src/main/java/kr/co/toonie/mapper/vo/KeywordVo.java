package kr.co.toonie.mapper.vo;

import java.util.ArrayList;

public class KeywordVo {
	private String toonKeyword;
	private String toonTag;
	private String toondId;
	private ArrayList<String> toonTags;
	
	public String getToonKeyword() {
		return toonKeyword;
	}

	public void setToonKeyword(String toonKeyword) {
		this.toonKeyword = toonKeyword;
	}

	public String getToonTag() {
		return toonTag;
	}

	public void setToonTag(String toonTag) {
		this.toonTag = toonTag;
	}

	public String getToondId() {
		return toondId;
	}

	public void setToondId(String toondId) {
		this.toondId = toondId;
	}

	public ArrayList<String> getToonTags() {
		return toonTags;
	}

	public void setToonTags(ArrayList<String> toonTags) {
		this.toonTags = toonTags;
	}


	
	
}
