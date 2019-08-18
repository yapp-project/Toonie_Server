package kr.co.toonie.mapper.vo;

public class WorkListToonVo {
	private String toonID;
	private String toonName;
	private String regDt;
	private String regTm;
	private String regOrder;
	private String instaLatestPostUrl;
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
	public String getRegOrder() {
		return regOrder;
	}
	public void setRegOrder(String regOrder) {
		this.regOrder = regOrder;
	}
	public String getInstaLatestPostUrl() {
		return instaLatestPostUrl;
	}
	public void setInstaLatestPostUrl(String instaLatestPostUrl) {
		this.instaLatestPostUrl = instaLatestPostUrl;
	}
	
	@Override
	public String toString() {
		return "WorkListToonVo [toonID=" + toonID + ", toonName=" + toonName + ", regDt=" + regDt + ", regTm=" + regTm
				+ ", regOrder=" + regOrder + ", instaLatestPostUrl=" + instaLatestPostUrl + "]";
	}

}
