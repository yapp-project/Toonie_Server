package kr.co.toonie.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import kr.co.toonie.mapper.vo.TokenVo;
import kr.co.toonie.mapper.vo.ToonVo;

@Mapper
public interface ToonMapper {
	ArrayList<ToonVo> selectToonList();
	ToonVo selectToon(String toonId);
	ArrayList<String> selectTagListInToon(String toonID);
	ArrayList<String> selectCurationTagListInToon(String toonID);
	ArrayList<ToonVo> selectToonInKeyword(String keyword);
}
