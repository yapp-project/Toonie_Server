package kr.co.toonie.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.toonie.mapper.vo.KeywordListVo;
import kr.co.toonie.mapper.vo.MyKeywordListVo;
import kr.co.toonie.mapper.vo.ResultVo;
import kr.co.toonie.service.MyKeywordService;

@RestController
@RequestMapping("/mykeywords")
public class MyKeywordController {
	
	@Autowired
	MyKeywordService mykeywordService;
	
	@GetMapping("/{token}")
	public MyKeywordListVo getMyKeywordList(@PathVariable final String token) {
		System.out.println("GET - /mykeywords/:token");
		return mykeywordService.selectMyKeywordList(token);
	}
	
	@PostMapping("/{token}")
	public ResultVo updateKeywordList(@PathVariable final String token,
												@RequestBody KeywordListVo keywordList) {
		System.out.println("POST - /mykeywords/:token");
		return mykeywordService.updateMyKeywordList(token, keywordList);
	}
	
}
