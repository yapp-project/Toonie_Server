package kr.co.toonie.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import kr.co.toonie.mapper.vo.MyWorkListVo;

@Mapper
public interface MyWorkListMapper {
	int insertMyworkList(MyWorkListVo myWorkListVo);
	ArrayList<MyWorkListVo> selectMyWorkList(MyWorkListVo myWorkListVo);
}
