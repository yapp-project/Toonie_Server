package kr.co.toonie.mapper.vo;

public class WorkListParamVo {
	String token;
	String workListName;
	String workListInfo;
	String toonId;
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
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
		return "WorkListParamVo [token=" + token + ", workListName=" + workListName + ", workListInfo=" + workListInfo
				+ ", toonId=" + toonId + "]";
	}
	
	
	
}
