package com.yc.vote.entity;

public class Subject {
	private int vsId;
	private String vsTitle;
	private int vsType;
	private int voteCount;
	private int optionCount;
	
	public int getVoteCount() {
		return voteCount;
	}
	public void setVoteCount(int voteCount) {
		this.voteCount = voteCount;
	}
	public int getOptionCount() {
		return optionCount;
	}
	public void setOptionCount(int optionCount) {
		this.optionCount = optionCount;
	}
	public int getVsId() {
		return vsId;
	}
	public void setVsId(int vsId) {
		this.vsId = vsId;
	}
	public String getVsTitle() {
		return vsTitle;
	}
	public void setVsTitle(String vsTitle) {
		this.vsTitle = vsTitle;
	}
	public int getVsType() {
		return vsType;
	}
	public void setVsType(int vsType) {
		this.vsType = vsType;
	}
	public Subject() {
	}
	public Subject(int vsId, String vsTitle, int vsType) {
		this.vsId = vsId;
		this.vsTitle = vsTitle;
		this.vsType = vsType;
	}
	@Override
	public String toString() {
		return "VoteSubject [vsId=" + vsId + ", vsTitle=" + vsTitle + ", vsType=" + vsType + "]";
	}
	
}
