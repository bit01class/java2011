package kr.co.tjoeun.bbs39;

import java.sql.Date;

public class BbsBean {
	// �ڹٺ�(javaBean) Ŭ���� (ĸ��ȭ) -> DTO -> VO
	// ������ ����
	// getter & setter
	private int num;
	private String sub;
	private String id;
	private int cnt;
	private String content;
	private Date nalja;
	
	// setter - set�ʵ��(�ʵ�� ù���� �빮��)
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










