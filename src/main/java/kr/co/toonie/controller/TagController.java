package kr.co.toonie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.toonie.mapper.vo.TagInfoListVo;
import kr.co.toonie.mapper.vo.TagInfoVo;
import kr.co.toonie.mapper.vo.TagListVo;
import kr.co.toonie.service.TagService;

@RestController
@RequestMapping("/tags")
public class TagController {
	@Autowired
	TagService tagService;
	
	@GetMapping
	public TagListVo getAllTagList() {
		System.out.println("GET - /tags");
		return tagService.selectTagList();
	}
	
	@GetMapping("/curationtags")
	public TagListVo getAllCurationList() {
		System.out.println("GET - /tags/curationtags");
		return tagService.selectCurationTagList();
	}
	
	@GetMapping("/curationtags/{tag}")
	public TagInfoVo getTagInfoByCurationTag(@PathVariable String tag) {
		System.out.println("GET - /tags/curationtags/:tag");
		return tagService.selectTagInfoByCurationTag(tag);
	}
	
	@GetMapping("/token/{token}")
	public TagInfoListVo getTagInfoList(@PathVariable String token) {
		return tagService.selectTagInfoList(token);
	}
	
	@GetMapping("/{tag}")
	public TagInfoVo getTagInfo(@PathVariable String tag) {
		return tagService.selectTagInfo(tag);
	}
	
	@GetMapping("/worklist/{token}/{worklist}")
	public TagInfoListVo getToonListRelatedWorkList(@PathVariable String token, @PathVariable String worklist) {
		return tagService.selectToonListRelatedWorkList(token, worklist);
	}
	
}

