package kr.co.toonie.mapper.vo;

public class MyWorkListVo {
	private String token;
	private String workListName;
	private String workListInfo;
	private String toonID;
	private int regOrder;
	private String regDt;
	private String regTm;
	
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
	public String getToonID() {
		return toonID;
	}
	public void setToonID(String toonID) {
		this.toonID = toonID;
	}
	public int getRegOrder() {
		return regOrder;
	}
	public void setRegOrder(int regOrder) {
		this.regOrder = regOrder;
	}
	public String getRegDt() {
		return regDt;
	}
	public void setRegDt(String regDt) {
		this.regDt = regDt;
	}
	public String getRegTm() {
		return regTm;
	}
	public void setRegTm(String regTm) {
		this.regTm = regTm;
	}
	
	
	@Override
	public String toString() {
		return "MyWorkListVo [token=" + token + ", workListName=" + workListName + ", workListInfo=" + workListInfo
				+ ", toonID=" + toonID + ", regOrder=" + regOrder + ", regDt=" + regDt + ", regTm=" + regTm + "]";
	}
	
	
	
}
