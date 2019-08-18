package kr.co.toonie.mapper;

import org.apache.ibatis.annotations.Mapper;

import kr.co.toonie.mapper.vo.TokenVo;

@Mapper
public interface TokenMapper {
	String selectNow();
	int insertToken(String token);
	int insertDefaultWorkList(String token);
	int insertLatestWorkList(String token);
}
