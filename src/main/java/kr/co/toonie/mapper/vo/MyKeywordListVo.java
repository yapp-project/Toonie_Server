package kr.co.toonie.mapper.vo;

import java.util.ArrayList;

public class MyKeywordListVo {
	private boolean success;
	private ArrayList<String> myKeywords;
	private String token;
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	public ArrayList<String> getMyKeywords() {
		return myKeywords;
	}
	public void setMyKeywords(ArrayList<String> myKeywords) {
		this.myKeywords = myKeywords;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	@Override
	public String toString() {
		return "MyKeywordListVo [success=" + success + ", myKeywords=" + myKeywords + ", token=" + token + "]";
	}
	
}
