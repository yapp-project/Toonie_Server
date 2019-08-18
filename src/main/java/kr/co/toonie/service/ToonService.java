package kr.co.toonie.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.toonie.mapper.TagMapper;
import kr.co.toonie.mapper.ToonMapper;
import kr.co.toonie.mapper.vo.TagInfoListVo;
import kr.co.toonie.mapper.vo.TagInfoVo;
import kr.co.toonie.mapper.vo.TagListVo;
import kr.co.toonie.mapper.vo.TagVo;
import kr.co.toonie.mapper.vo.ToonVo;

@Service
public class ToonService {
	@Autowired
	ToonMapper toonMapper;
	
	public TagInfoListVo selectToonList() {
		ArrayList<ToonVo> toonList = toonMapper.selectToonList();
		ArrayList<ToonVo> toonInfoList = new ArrayList();
		TagInfoListVo tagInfoListVo = new TagInfoListVo();
		System.out.println("toonList : " + toonList.toString());
		
		for(ToonVo toonVo : toonList) {
			String toonId = toonVo.getToonID();
			System.out.println("toon 정보: " + toonVo.toString());
			System.out.println("toonID : " + toonId);
			ArrayList<String> tagList = toonMapper.selectTagListInToon(toonId);
			ArrayList<String> curationTagList = toonMapper.selectCurationTagListInToon(toonId);
			toonVo.setToonTagList(tagList);
			toonVo.setCurationTagList(curationTagList);
			toonInfoList.add(toonVo);
		}
		tagInfoListVo.setToonList(toonInfoList);
		return tagInfoListVo;
		
	}
	
	public ToonVo selectToon(String toonId) {
		ToonVo toonInfo = toonMapper.selectToon(toonId);
		ArrayList<String> tagList = toonMapper.selectTagListInToon(toonId);
		ArrayList<String> curationTagList = toonMapper.selectCurationTagListInToon(toonId);
		toonInfo.setToonTagList(tagList);
		toonInfo.setCurationTagList(curationTagList);
		
		return toonInfo;
	}
	
	public TagInfoListVo selectToonInKeyword(String keyword) {
		ArrayList<ToonVo> toonList = toonMapper.selectToonInKeyword(keyword);
		ArrayList<ToonVo> toonInfoList = new ArrayList();
		TagInfoListVo tagInfoListVo = new TagInfoListVo();
		System.out.println("toonList : " + toonList.toString());
		
		for(ToonVo toonVo : toonList) {
			String toonId = toonVo.getToonID();
			System.out.println("toon 정보: " + toonVo.toString());
			System.out.println("toonID : " + toonId);
			ArrayList<String> tagList = toonMapper.selectTagListInToon(toonId);
			ArrayList<String> curationTagList = toonMapper.selectCurationTagListInToon(toonId);
			toonVo.setToonTagList(tagList);
			toonVo.setCurationTagList(curationTagList);
			toonInfoList.add(toonVo);
		}
		tagInfoListVo.setToonList(toonInfoList);
		return tagInfoListVo;
		
	}
	
}
