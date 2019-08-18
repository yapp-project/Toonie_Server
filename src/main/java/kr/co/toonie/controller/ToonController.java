package kr.co.toonie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.toonie.mapper.vo.TagInfoListVo;
import kr.co.toonie.mapper.vo.ToonVo;
import kr.co.toonie.service.ToonService;

@RestController
@RequestMapping("/toons")
public class ToonController {
	@Autowired
	ToonService toonService;
	
	@GetMapping
	public TagInfoListVo getToonList() {
		System.out.println("GET - /toons");
		return toonService.selectToonList();
	}
	
	@GetMapping("/{toonId}")
	public ToonVo getToon(@PathVariable String toonId) {
		System.out.println("GET - /toons/:toonId");
		return toonService.selectToon(toonId);
	}
	
	@GetMapping("/keyword/{keyword}")
	public TagInfoListVo selectToonInKeyword(@PathVariable String keyword) {
		System.out.println("GET - /toons/keyword");
		return toonService.selectToonInKeyword(keyword);
	}

	
}

