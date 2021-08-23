package kr.co.tjoeun.bbs01.dto;

import java.sql.Date;

public class Bbs01Dto {
	private int num;
	private String name;
	private String sub;
	private String content;
	private Date nalja;
	
	public Bbs01Dto(){}

	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public String getSub() {
		return sub;
	}

	public String getContent() {
		return content;
	}

	public Date getNalja() {
		return nalja;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setNalja(Date nalja) {
		this.nalja = nalja;
	}
	
}
