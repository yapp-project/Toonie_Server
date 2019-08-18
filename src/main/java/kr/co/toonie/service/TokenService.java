package kr.co.toonie.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.toonie.mapper.TokenMapper;
import kr.co.toonie.mapper.vo.TokenVo;

@Service
public class TokenService {
	
	@Autowired(required=true)
	private TokenMapper tokenMapper;
	
	public String selectNow() {
		return tokenMapper.selectNow();
	}
	
	public TokenVo createToken() {
		
		SimpleDateFormat yymmddFormat = new SimpleDateFormat("yyMMddhhmmss");
		String curDate = yymmddFormat.format(new Date());
		
		Random rnd =new Random();

		StringBuffer buf =new StringBuffer();

		for(int i=0;i<10;i++){
		    if(rnd.nextBoolean()){
		        buf.append((char)((int)(rnd.nextInt(26))+97));
		    }else{
		        buf.append((rnd.nextInt(10))); 
		    }
		}
		
		String token = curDate + buf.toString();
		TokenVo tokenVo = new TokenVo();
		
		if(tokenMapper.insertToken(token)==1) {
			tokenVo.setSuccess(true);
			tokenVo.setToken(token);
			//tokenMapper.insertDefaultWorkList(token);
			//tokenMapper.insertLatestWorkList(token);
		} else {
			tokenVo.setSuccess(false);
		}
		
		return tokenVo;
	}
}
