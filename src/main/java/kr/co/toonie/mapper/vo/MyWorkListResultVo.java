package kr.co.toonie.mapper.vo;

import java.util.ArrayList;

public class MyWorkListResultVo {
	private String workListName;
	private String worKListInfo;
	
	private ArrayList<ToonVo> toonList;
	public String getWorkListName() {
		return workListName;
	}
	public void setWorkListName(String workListName) {
		this.workListName = workListName;
	}
	public String getWorKListInfo() {
		return worKListInfo;
	}
	public void setWorKListInfo(String worKListInfo) {
		this.worKListInfo = worKListInfo;
	}
	public ArrayList<ToonVo> getToonList() {
		return toonList;
	}
	public void setToonList(ArrayList<ToonVo> toonList) {
		this.toonList = toonList;
	}
	
	@Override
	public String toString() {
		return "MyWorkListResultVo [workListName=" + workListName + ", worKListInfo=" + worKListInfo + ", toonList="
				+ toonList + "]";
	}
	
	
}
