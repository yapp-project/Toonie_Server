package kr.co.toonie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.toonie.mapper.vo.VersionVo;
import kr.co.toonie.service.VersionService;


@RestController
@RequestMapping("/version")
public class VersionController {
	
	@Autowired
	private VersionService versionService;
	
	
	@GetMapping
	public VersionVo getVersion() {
		System.out.println("GET - /version");
		return versionService.getVersion();
	}
	
	
}
