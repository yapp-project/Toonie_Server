package kr.co.toonie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.toonie.mapper.vo.KeywordListVo;
import kr.co.toonie.mapper.vo.MyWorkListResultListVo;
import kr.co.toonie.mapper.vo.MyWorkListResultVo;
import kr.co.toonie.mapper.vo.ResultVo;
import kr.co.toonie.mapper.vo.TagInfoListVo;
import kr.co.toonie.mapper.vo.ToonVo;
import kr.co.toonie.mapper.vo.WorkListReqVo;
import kr.co.toonie.service.ToonService;
import kr.co.toonie.service.WorkListService;

@RestController
@RequestMapping("/worklist")
public class WorkListController {
	@Autowired
	WorkListService workListService;

	@GetMapping("/{token}")
	public MyWorkListResultListVo getListOfWorkList(@PathVariable String token) {
		System.out.println("GET - /worklist/:token");
		return workListService.selectListOfWorkList(token);
	}
	
	@GetMapping("/{token}/{workListName}")
	public MyWorkListResultVo getWorkList(@PathVariable String token, @PathVariable String workListName) {
		System.out.println("GET - /worklist/:token/:workListName");
		return workListService.selectWorkList(token, workListName);
	}
	
	
	@PostMapping("/{token}/{workListName}")
	public ResultVo createWorkList(@PathVariable final String token,
												@RequestBody WorkListReqVo  workListReq) {
		System.out.println("POST - /worklist/:token/:workListName");
		return workListService.createWorkList(token, workListReq);
	}
	
}

