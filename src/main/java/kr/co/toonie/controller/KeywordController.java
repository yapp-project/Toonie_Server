package kr.co.toonie.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.toonie.mapper.vo.KeywordListVo;
import kr.co.toonie.mapper.vo.KeywordVo;
import kr.co.toonie.service.KeywordService;

@RestController
@RequestMapping("/keywords")
public class KeywordController {
	
	@Autowired
	KeywordService keywordService;
	
	@GetMapping
	public KeywordListVo getKeywordList() {
		System.out.println("GET - /keywords");
		return keywordService.selectKeywordList();
	}
	
	@GetMapping("/{keyword}")
	public KeywordVo getTagsInKeywod(@PathVariable final String keyword) {
		System.out.println("GET - /keywords/:keyword");
		System.out.println("param : " + keyword);
		return keywordService.selectTagsInKeyword(keyword);
	}
}
