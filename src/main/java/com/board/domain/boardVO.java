package com.board.domain;

public class boardVO {
	
	private int bno;
	private String title;
	private String content;
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "boardVO [bno=" + bno + ", title=" + title + ", content=" + content + "]";
	}
	
}
