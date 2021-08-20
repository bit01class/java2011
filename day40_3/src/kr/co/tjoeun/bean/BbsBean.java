package kr.co.tjoeun.bean;

import java.sql.Date;

public class BbsBean {
	private int num,cnt;
	private String sub,content,id;
	private Date nalja;
	
	public int getNum() {
		return num;
	}
	public int getCnt() {
		return cnt;
	}
	public String getSub() {
		return sub;
	}
	public String getContent() {
		return content;
	}
	public String getId() {
		return id;
	}
	public Date getNalja() {
		return nalja;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setNalja(Date nalja) {
		this.nalja = nalja;
	}
}
