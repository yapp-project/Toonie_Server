package kr.co.toonie.service;


import org.springframework.stereotype.Service;

import kr.co.toonie.mapper.vo.ForceVersionVo;
import kr.co.toonie.mapper.vo.TargetVersionVo;
import kr.co.toonie.mapper.vo.VersionVo;

@Service
public class VersionService {
	

	public VersionVo getVersion() {
		
		String forcedAlertMode = "oneButton";
		String forcedVersion = "1.0.0";
		String forcedString = "강제업데이트 알럿 메시지";
		String forcedMoveUrl = "https://github.com/yapp-project/Toonie";
		

		String targetAlertMode = "oneButton";
		String targetVersion = "1.0.0";
		String targetString = "타겟 업데이트 알럿 메시지.";
		String targetMoveUrl = "https://github.com/yapp-project/Toonie";
		
		VersionVo versionVo = new VersionVo();

		
		ForceVersionVo fVersion = new ForceVersionVo();
		TargetVersionVo tVersion = new TargetVersionVo();
		
		fVersion.setForcedAlertMode(forcedAlertMode);
		fVersion.setForcedVersion(forcedVersion);
		fVersion.setForcedString(forcedString);
		fVersion.setForcedMoveUrl(forcedMoveUrl);
		
		tVersion.setTargetAlertMode(targetAlertMode);
		tVersion.setTargetVersion(targetVersion);
		tVersion.setTargetString(targetString);
		tVersion.setTargetMoveUrl(targetMoveUrl);
		
		versionVo.setForcedUpdate(false);
		versionVo.setTargetUpdate(false);
		versionVo.setForceInfo(fVersion);
		versionVo.setTargetInfo(tVersion);
		
		return versionVo;
	}
}
