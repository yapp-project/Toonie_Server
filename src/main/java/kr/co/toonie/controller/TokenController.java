package kr.co.toonie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.toonie.mapper.vo.TokenVo;
import kr.co.toonie.service.TokenService;

@RestController
@RequestMapping("/token")
public class TokenController {
	
	@Autowired
	private TokenService tokenService;
	
	@GetMapping("/{token}")
	public String getToken(@PathVariable final String token) {
		System.out.println("GET - /token/:token");
		return "token 조회" + token;		
	}
	
	@GetMapping
	public TokenVo getToken() {
		System.out.println("GET - /tags");
		return tokenService.createToken();
	}
	
	@PostMapping
	public TokenVo createToken() {
		System.out.println("POST - /tags");
		return tokenService.createToken();
	}
	
}
