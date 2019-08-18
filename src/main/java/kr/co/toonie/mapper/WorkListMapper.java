package kr.co.toonie.mapper;


import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import kr.co.toonie.mapper.vo.MyWorkListResultListVo;
import kr.co.toonie.mapper.vo.MyWorkListResultVo;
import kr.co.toonie.mapper.vo.MyWorkListVo;
import kr.co.toonie.mapper.vo.ToonVo;
import kr.co.toonie.mapper.vo.WorkListParamVo;

@Mapper
public interface WorkListMapper {
	ArrayList<MyWorkListVo> selectListOfWorkList(String token);
	ArrayList<MyWorkListVo> selectWorkList(WorkListParamVo workListParamVo);
	ToonVo selectToon(String toonId);
	ArrayList<String> selectTagListInToon(String toonID);
	ArrayList<String> selectCurationTagListInToon(String toonID);
	int countToonInWorkList(WorkListParamVo workListParamVo);
	void insertToonInWorkList(WorkListParamVo workListParamVo);
	void deleteToonInWorkList(WorkListParamVo workListParamVo);
	int countToonListInWorkList(WorkListParamVo worListParamVo);
	String selectFirstToonIdInWorkList(WorkListParamVo worListParamVo);
}
