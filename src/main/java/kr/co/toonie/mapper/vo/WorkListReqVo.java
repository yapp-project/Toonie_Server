package kr.co.toonie.mapper.vo;

import java.util.ArrayList;

public class WorkListReqVo {
	public String workListName;
	public String workListInfo;
	public String toonId;
	public String getWorkListName() {
		return workListName;
	}
	public void setWorkListName(String workListName) {
		this.workListName = workListName;
	}
	public String getWorkListInfo() {
		return workListInfo;
	}
	public void setWorkListInfo(String workListInfo) {
		this.workListInfo = workListInfo;
	}
	
	public String getToonId() {
		return toonId;
	}
	public void setToonId(String toonId) {
		this.toonId = toonId;
	}
	@Override
	public String toString() {
		return "WorkListReqVo [workListName=" + workListName + ", workListInfo=" + workListInfo + ", toonId=" + toonId
				+ "]";
	}
	
	
}
