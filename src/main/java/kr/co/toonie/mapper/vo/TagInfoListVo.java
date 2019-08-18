package kr.co.toonie.mapper.vo;

import java.util.ArrayList;

public class TagInfoListVo {
	private ArrayList<ToonVo> toonList;

	public ArrayList<ToonVo> getToonList() {
		return toonList;
	}

	public void setToonList(ArrayList<ToonVo> toonList) {
		this.toonList = toonList;
	}

	@Override
	public String toString() {
		return "TagInfoListVo [toonList=" + toonList + "]";
	}
	
	
	
}
