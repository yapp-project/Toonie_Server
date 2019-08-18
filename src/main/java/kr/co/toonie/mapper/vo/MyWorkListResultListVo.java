package kr.co.toonie.mapper.vo;

import java.util.ArrayList;

public class MyWorkListResultListVo {
	private ArrayList<MyWorkListResultVo> listOfWorkList;

	public ArrayList<MyWorkListResultVo> getListOfWorkList() {
		return listOfWorkList;
	}

	public void setListOfWorkList(ArrayList<MyWorkListResultVo> listOfWorkList) {
		this.listOfWorkList = listOfWorkList;
	}

	@Override
	public String toString() {
		return "MyWorkListResultListVo [listOfWorkList=" + listOfWorkList + "]";
	}
	
	
}
