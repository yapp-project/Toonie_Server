package kr.co.toonie.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import kr.co.toonie.mapper.vo.TokenVo;

@Mapper
public interface MyKeywordMapper {
	ArrayList<String> selectMyKeywordList(String token);
	int deleteMyKeyword(TokenVo tokenVo);
	int insertMyKeyword(TokenVo tokenVo);
}
