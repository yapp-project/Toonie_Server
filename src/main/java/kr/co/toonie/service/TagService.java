package kr.co.toonie.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.toonie.mapper.TagMapper;
import kr.co.toonie.mapper.vo.TagInfoListVo;
import kr.co.toonie.mapper.vo.TagInfoVo;
import kr.co.toonie.mapper.vo.TagListVo;
import kr.co.toonie.mapper.vo.TagVo;
import kr.co.toonie.mapper.vo.ToonVo;
import kr.co.toonie.mapper.vo.WorkListParamVo;

@Service
public class TagService {
	@Autowired
	TagMapper tagMapper;
	
	public TagInfoListVo selectTagInfoList(String token) {
		
		TagInfoListVo tagInfoListVo = new TagInfoListVo();
		ArrayList<String> toonList = tagMapper.selectToonListInMyTag(token);
		ArrayList<ToonVo> toonInfoList = new ArrayList();
		for(String toonID : toonList) {
			ToonVo toonVo = tagMapper.selectToonInfo(toonID);
			ArrayList<String> tagList = tagMapper.selectTagListInToon(toonID);
			ArrayList<String> curationTagList = tagMapper.selectCurationTagListInToon(toonID);
			if(!tagList.isEmpty()) {
				toonVo.setToonTagList(tagList);
			}
			if(!curationTagList.isEmpty()) {
				toonVo.setCurationTagList(curationTagList);
			}
			if(!tagList.isEmpty() && !curationTagList.isEmpty()) {
				toonInfoList.add(toonVo);
			}
		}
		
		tagInfoListVo.setToonList(toonInfoList);
		return tagInfoListVo;
	}
	
	public TagInfoVo selectTagInfo(String tag) {
		ArrayList<ToonVo> toonList = tagMapper.selectToonInTag(tag);
		TagInfoVo tagInfoVo = new TagInfoVo();
		ArrayList<ToonVo> toonInfoList = new ArrayList();
		
		for(ToonVo toonVo : toonList) {
			ArrayList<String> tagList = tagMapper.selectTagListInToon(toonVo.getToonID());
			ArrayList<String> curationTagList = tagMapper.selectCurationTagListInToon(toonVo.getToonID());
			toonVo.setToonTagList(tagList);
			toonVo.setCurationTagList(curationTagList);
			toonInfoList.add(toonVo);
		}
		tagInfoVo.setToonTag(tag);
		tagInfoVo.setToonInfoList(toonInfoList);
		return tagInfoVo;
	}
	
	public TagListVo selectTagList() {
		TagListVo tagListVo = new TagListVo();
		tagListVo.setSucceess(true);
		tagListVo.setTagList(tagMapper.selectTagList());
		return tagListVo;
	}
	
	public TagListVo selectCurationTagList() {
		TagListVo tagListVo = new TagListVo();
		tagListVo.setSucceess(true);
		tagListVo.setCurationTagList(tagMapper.selectCurationTagList());
		return tagListVo;
	}
	
	public TagInfoVo selectTagInfoByCurationTag(String tag) {
		ArrayList<ToonVo> toonList = tagMapper.selectToonInCurationTag(tag);
		TagInfoVo tagInfoVo = new TagInfoVo();
		ArrayList<ToonVo> toonInfoList = new ArrayList();
		System.out.println("toonList : " + toonList.toString());
		
		for(ToonVo toonVo : toonList) {
			ArrayList<String> tagList = tagMapper.selectTagListInToon(toonVo.getToonID());
			ArrayList<String> curationTagList = tagMapper.selectCurationTagListInToon(toonVo.getToonID());
			toonVo.setToonTagList(tagList);
			toonVo.setCurationTagList(curationTagList);
			toonInfoList.add(toonVo);
		}
		tagInfoVo.setToonTag(tag);
		tagInfoVo.setToonInfoList(toonInfoList);
		return tagInfoVo;
	}
	
	public TagInfoListVo selectToonListRelatedWorkList(String token,String worklist) {
		TagInfoListVo tagInfoListVo = new TagInfoListVo();
		WorkListParamVo workListParamVo = new WorkListParamVo();
		workListParamVo.setToken(token);
		workListParamVo.setWorkListName(worklist);
		ArrayList<ToonVo> toonInfoList = new ArrayList();
		ArrayList<String> tagList = tagMapper.selectTagListInWorkList(workListParamVo);

		System.out.println("tagList : " + tagList.toString());
		HashMap map = new HashMap();
		map.put("tagList", tagList);
		toonInfoList.addAll(tagMapper.selectToonInTagList(map));
		
		
		
		
		System.out.println("toonInfoList :" + toonInfoList.toString());
		ArrayList<ToonVo> toonResultList = new ArrayList();
		for(ToonVo toon : toonInfoList) {
			System.out.println("for문 : " + toon.toString());
			String toonID = toon.getToonID();
			ToonVo toonVo = tagMapper.selectToonInfo(toonID);
			ArrayList<String> tagInToonList = tagMapper.selectTagListInToon(toonID);
			ArrayList<String> curationTagList = tagMapper.selectCurationTagListInToon(toonID);
			if(!tagInToonList.isEmpty()) {
				toonVo.setToonTagList(tagInToonList);
			}
			if(!curationTagList.isEmpty()) {
				toonVo.setCurationTagList(curationTagList);
			}
			if(!tagInToonList.isEmpty() && !curationTagList.isEmpty()) {
				toonResultList.add(toonVo);
			}
		}
		
		tagInfoListVo.setToonList(toonResultList);
		
		
		
		return tagInfoListVo;
	}
	
}
