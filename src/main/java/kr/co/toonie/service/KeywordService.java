package kr.co.toonie.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.toonie.mapper.KeywordMapper;
import kr.co.toonie.mapper.vo.KeywordListVo;
import kr.co.toonie.mapper.vo.KeywordVo;

@Service
public class KeywordService {
	
	@Autowired
	private KeywordMapper keywordMapper;
	
	public KeywordListVo selectKeywordList() {
		KeywordListVo keywordListVo = new KeywordListVo();
		
		List<KeywordVo> keywordVoList = keywordMapper.selectKeywordList(); 
		ArrayList<String> keywordList = new ArrayList<String>();
		if(!(keywordVoList).isEmpty()) {
			for(KeywordVo keywordInfo : keywordVoList) {
				keywordList.add(keywordInfo.getToonKeyword());
			}
		}
		
		keywordListVo.setKeywords(keywordList);
		return keywordListVo;
	}
	
	public KeywordVo selectTagsInKeyword(String keyword) {
		KeywordVo tagsInKeywordVo = new KeywordVo();
		
		List<KeywordVo> keywordVoList = keywordMapper.selectTagsInKeyword(keyword);
		ArrayList<String> tagList = new ArrayList<String>();
		if(!(keywordVoList.isEmpty())) {
			for(KeywordVo keywordInfo : keywordVoList) {
				tagList.add(keywordInfo.getToonTag());
			}

			tagsInKeywordVo.setToonKeyword(keyword);
			tagsInKeywordVo.setToonTags(tagList);
		}
		
		
		return tagsInKeywordVo;
	}
}
