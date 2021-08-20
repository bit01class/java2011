package kr.co.tjoeun.bbs39;

import java.sql.Date;

public class BbsBean {
	// 자바빈(javaBean) 클래스 (캡슐화) -> DTO -> VO
	// 정보의 은닉
	// getter & setter
	private int num;
	private String sub;
	private String id;
	private int cnt;
	private String content;
	private Date nalja;
	
	// setter - set필드명(필드명 첫글자 대문자)
	public void setNum(int num){
		this.num=num;
	}
	public void setSub(String sub){
		this.sub=sub;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setNalja(Date nalja) {
		this.nalja = nalja;
	}
	
	// getter 
	public int getNum(){
		return this.num;
	}
	public String getSub() {
		return sub;
	}
	public String getId() {
		return id;
	}
	public int getCnt() {
		return cnt;
	}
	public String getContent() {
		return content;
	}
	public Date getNalja() {
		return nalja;
	}
}










