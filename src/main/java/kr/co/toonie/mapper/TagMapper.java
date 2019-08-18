package kr.co.toonie.mapper;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

import kr.co.toonie.mapper.vo.TagVo;
import kr.co.toonie.mapper.vo.ToonVo;
import kr.co.toonie.mapper.vo.WorkListParamVo;

@Mapper
public interface TagMapper {
	ArrayList<String> selectMyTagList(String token);
	ArrayList<ToonVo> selectToonInTag(String tag);
	ArrayList<ToonVo> selectToonInTagList(HashMap tagList);
	ArrayList<String> selectTagList();
	ArrayList<String> selectTagListInToon(String toonID);
	ArrayList<String> selectToonListInMyTag(String token);
	ToonVo selectToonInfo(String toonID);
	ArrayList<String> selectCurationTagListInToon(String toonID);
	ArrayList<String> selectCurationTagList();
	ArrayList<ToonVo> selectToonInCurationTag(String curationTag);
	ArrayList<String> selectTagListInWorkList(WorkListParamVo workListParamVo);
	
}
