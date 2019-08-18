package kr.co.toonie.mapper.vo;

import java.util.ArrayList;

public class VersionVo {
	private boolean forcedUpdate;
	private ForceVersionVo forceInfo;
	private boolean targetUpdate;
	private TargetVersionVo targetInfo;
	public boolean getForcedUpdate() {
		return forcedUpdate;
	}
	public void setForcedUpdate(boolean forcedUpdate) {
		this.forcedUpdate = forcedUpdate;
	}
	public ForceVersionVo getForceInfo() {
		return forceInfo;
	}
	public void setForceInfo(ForceVersionVo forceInfo) {
		this.forceInfo = forceInfo;
	}
	public boolean getTargetUpdate() {
		return targetUpdate;
	}
	public void setTargetUpdate(boolean targetUpdate) {
		this.targetUpdate = targetUpdate;
	}
	public TargetVersionVo getTargetInfo() {
		return targetInfo;
	}
	public void setTargetInfo(TargetVersionVo targetInfo) {
		this.targetInfo = targetInfo;
	}
	
	
}
