package kr.co.toonie.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.toonie.mapper.CommonMapper;
import kr.co.toonie.mapper.MyKeywordMapper;
import kr.co.toonie.mapper.vo.KeywordListVo;
import kr.co.toonie.mapper.vo.KeywordVo;
import kr.co.toonie.mapper.vo.MyKeywordListVo;
import kr.co.toonie.mapper.vo.ResultVo;
import kr.co.toonie.mapper.vo.TokenVo;

@Service
public class MyKeywordService {
	@Autowired
	private MyKeywordMapper myKeywordMapper;
	@Autowired
	private CommonMapper commonMapper;
	
	public MyKeywordListVo selectMyKeywordList(String token) {
		System.out.println("token value : "  + token);
		ArrayList<String> myKeywordList = myKeywordMapper.selectMyKeywordList(token);
		MyKeywordListVo myKeywordListVo = new MyKeywordListVo();
		myKeywordListVo.setMyKeywords(myKeywordList);
		myKeywordListVo.setToken(token);
		myKeywordListVo.setSuccess(true);
		
		return myKeywordListVo;
	}
	
	public ResultVo updateMyKeywordList(String token, KeywordListVo keywordListVo) {
		
		MyKeywordListVo myKeywordListVo = new MyKeywordListVo();
		ArrayList<String> updateKeywordList = keywordListVo.getKeywords();
		myKeywordListVo.setToken(token);
		myKeywordListVo.setMyKeywords(updateKeywordList);
		System.out.println(myKeywordListVo.toString());
		
		ArrayList<String> deleteMyKeywordList = commonMapper.selectMyKeywords(myKeywordListVo);
		
		if(!deleteMyKeywordList.isEmpty()) {
			for(String keyword : deleteMyKeywordList) {
				TokenVo tokenVo = new TokenVo();
				tokenVo.setToken(token);
				tokenVo.setToonKeyword(keyword);
				System.out.println("지울 My keyword : " + tokenVo.toString());
			
				myKeywordMapper.deleteMyKeyword(tokenVo);
				updateKeywordList.remove(keyword);
			}
		}
		
		
		
		
		if(!updateKeywordList.isEmpty()) {
			for(String keyword : updateKeywordList) {
				TokenVo tokenVo = new TokenVo();
				tokenVo.setToken(token);
				tokenVo.setToonKeyword(keyword);
				myKeywordMapper.insertMyKeyword(tokenVo);
			}
		}
		System.out.println("삭제된 MykeywordList : " + deleteMyKeywordList.toString());
		System.out.println("추가된 MykeywordList : " + updateKeywordList.toString());
		
		
		ResultVo resultVo = new ResultVo();
		resultVo.setSuccess(true);
		
		return resultVo;
	}
	

}
