package kr.co.toonie.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import kr.co.toonie.mapper.vo.MyKeywordListVo;

@Mapper
public interface CommonMapper {
	int countKeyword(ArrayList<String> keywordList);
	ArrayList<String> selectMyKeywords(MyKeywordListVo myKeywordListVo);
}
