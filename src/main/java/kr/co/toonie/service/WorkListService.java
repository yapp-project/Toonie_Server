package kr.co.toonie.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.toonie.mapper.WorkListMapper;
import kr.co.toonie.mapper.vo.MyWorkListResultListVo;
import kr.co.toonie.mapper.vo.MyWorkListResultVo;
import kr.co.toonie.mapper.vo.MyWorkListVo;
import kr.co.toonie.mapper.vo.ResultVo;
import kr.co.toonie.mapper.vo.ToonVo;
import kr.co.toonie.mapper.vo.WorkListParamVo;
import kr.co.toonie.mapper.vo.WorkListReqVo;


@Service
public class WorkListService {
	@Autowired
	WorkListMapper workListMapper;


	public MyWorkListResultListVo selectListOfWorkList(String token) {

		System.out.println("url:worklist/token");
		ArrayList<MyWorkListVo> workList = workListMapper.selectListOfWorkList(token);
		System.out.println("workListMapper.selectListOfWorkList Result : " + workList.toString());

		WorkListParamVo workListParamVo = new WorkListParamVo();
		workListParamVo.setToken(token);
		ArrayList<MyWorkListResultVo> listOfWorkList = new ArrayList();

		for(MyWorkListVo workListVo : workList) {
			String workListName = workListVo.getWorkListName();
			workListParamVo.setWorkListName(workListName);		
			ArrayList<MyWorkListVo> workListInfo = workListMapper.selectWorkList(workListParamVo);



			ArrayList<ToonVo> toonInfoList = new ArrayList();
			
			for(MyWorkListVo workListInfoVo : workListInfo) {

				String toonId = workListInfoVo.getToonID();
				ToonVo toonInfo = workListMapper.selectToon(toonId);
				System.out.println("toonId" + toonId);
				ArrayList<String> tagList = workListMapper.selectTagListInToon(toonId);
				ArrayList<String> curationTagList = workListMapper.selectCurationTagListInToon(toonId);


				if(!tagList.isEmpty()) {
					toonInfo.setToonTagList(tagList);
				}
				if(!curationTagList.isEmpty()) {
					toonInfo.setCurationTagList(curationTagList);
				}

				toonInfoList.add(toonInfo);
				System.out.println("toonInfo : " + toonInfo);
				System.out.println("toonInfoList : " + toonInfoList);
			}

			MyWorkListResultVo myWorkListResultVo = new MyWorkListResultVo();
			myWorkListResultVo.setWorkListName(workListName);
			myWorkListResultVo.setToonList(toonInfoList);
			listOfWorkList.add(myWorkListResultVo);

			System.out.println("myWorkListResultVo : " + myWorkListResultVo);

		}

		MyWorkListResultListVo myWorkListResultListVo = new MyWorkListResultListVo();
		myWorkListResultListVo.setListOfWorkList(listOfWorkList);

		System.out.println(">>>>>>Result : " +  myWorkListResultListVo.toString());

		return myWorkListResultListVo;

	}

	public MyWorkListResultVo selectWorkList(String token, String workListName) {

		System.out.println("url:worklist/token/workListName");
		WorkListParamVo workListParamVo = new WorkListParamVo();
		workListParamVo.setWorkListName(workListName);	
		workListParamVo.setToken(token);
		ArrayList<MyWorkListVo> workListInfo = workListMapper.selectWorkList(workListParamVo);
		System.out.println("workListMapper.selectWorkList Result : " + workListInfo.toString());


		ArrayList<ToonVo> toonInfoList = new ArrayList();

		for(MyWorkListVo workListInfoVo : workListInfo) {
			String toonId = workListInfoVo.getToonID();
			ToonVo toonInfo = workListMapper.selectToon(toonId);
			ArrayList<String> tagList = workListMapper.selectTagListInToon(toonId);
			ArrayList<String> curationTagList = workListMapper.selectCurationTagListInToon(toonId);
			
			System.out.println("workListMapper.selectTagListInToon Result : " + tagList.toString());
			System.out.println("workListMapper.selectCurationTagListInToon Result : " + curationTagList.toString());
			if(!tagList.isEmpty()) {
				toonInfo.setToonTagList(tagList);
			}
			if(!curationTagList.isEmpty()) {
				toonInfo.setCurationTagList(curationTagList);
			}

			if(!tagList.isEmpty() && !curationTagList.isEmpty()) {
				toonInfoList.add(toonInfo);
			}


		}

		MyWorkListResultVo myWorkListResultVo = new MyWorkListResultVo();
		myWorkListResultVo.setWorkListName(workListName);
		myWorkListResultVo.setToonList(toonInfoList);

		return myWorkListResultVo;
	}

	public ResultVo createWorkList(String token, WorkListReqVo workListReq) {

		String toonId = workListReq.getToonId();

		
		MyWorkListVo myWorkListVo = new MyWorkListVo();
		myWorkListVo.setToonID(toonId);
		myWorkListVo.setWorkListInfo(workListReq.getWorkListInfo());
		myWorkListVo.setWorkListName(workListReq.getWorkListName());


		//이미 있는지 찾기(workListName, toonid)
		//이미 있으면 삭제 없으면 생성
		WorkListParamVo workListParamVo = new WorkListParamVo();
		workListParamVo.setToken(token);
		workListParamVo.setWorkListName(workListReq.getWorkListName());
		workListParamVo.setWorkListInfo(workListReq.getWorkListInfo());
		workListParamVo.setToonId(toonId);
		
		if(workListReq.getWorkListName().equals("default")) {
			boolean isDeleteTarget = workListMapper.countToonInWorkList(workListParamVo) == 1 ? true:false;
			System.out.println(workListParamVo.toString());
			if(isDeleteTarget) {
				System.out.println("delete");
				workListMapper.deleteToonInWorkList(workListParamVo);
			} else {
				System.out.println("insert");
				workListMapper.insertToonInWorkList(workListParamVo);
			}
		} else {
			boolean isDeleteTarget = workListMapper.countToonInWorkList(workListParamVo) == 1 ? true:false;
			if(isDeleteTarget) {
				System.out.println("latest 중복 처리로 패스!");
			} else {
				int toonCount = workListMapper.countToonListInWorkList(workListParamVo);
				
				if(toonCount >= 10) {
					String firstToonId = workListMapper.selectFirstToonIdInWorkList(workListParamVo);
					WorkListParamVo workListFirstToonParamVo = new WorkListParamVo();
					workListFirstToonParamVo.setToken(token);
					workListFirstToonParamVo.setWorkListName(workListReq.getWorkListName());
					workListFirstToonParamVo.setWorkListInfo(workListReq.getWorkListInfo());
					workListFirstToonParamVo.setToonId(firstToonId);
					System.out.println("맨처음 Latest 작품 : " + firstToonId);
					workListMapper.deleteToonInWorkList(workListFirstToonParamVo);

				}
				System.out.println("latest 작품 insert");
				workListMapper.insertToonInWorkList(workListParamVo);
			}
			
		
		}


		ResultVo result = new ResultVo();
		result.setSuccess(true);

		return result;
	}


}
