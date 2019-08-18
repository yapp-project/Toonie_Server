package kr.co.toonie.mapper.vo;

public class TokenVo {
	private boolean success;
	private String token;
	private String toonKeyword;

	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getToonKeyword() {
		return toonKeyword;
	}
	public void setToonKeyword(String toonKeyword) {
		this.toonKeyword = toonKeyword;
	}
	
	@Override
	public String toString() {
		return "TokenVo [success=" + success + ", token=" + token + ", toonKeyword=" + toonKeyword + "]";
	}

	
}
