package kr.co.tjoeun.bean;

import java.sql.Date;

public class BbsDto {
	private int num;
	private String name,sub,content;
	private Date nalja;
	private int ord,lvl,dep;
	
	public BbsDto() {
	}

	public int getOrd() {
		return ord;
	}
	
	public int getLvl() {
		return lvl;
	}

	public int getDep() {
		return dep;
	}

	public void setOrd(int ord) {
		this.ord = ord;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	public void setDep(int dep) {
		this.dep = dep;
	}

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
