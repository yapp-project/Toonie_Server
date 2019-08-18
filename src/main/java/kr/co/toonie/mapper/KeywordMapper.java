package kr.co.toonie.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import kr.co.toonie.mapper.vo.KeywordVo;
import kr.co.toonie.mapper.vo.ToonVo;

@Mapper
public interface KeywordMapper {
	ArrayList<KeywordVo> selectKeywordList();

	ArrayList<KeywordVo> selectTagsInKeyword(String keywords);

}
