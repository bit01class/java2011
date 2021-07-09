package kr.co.joy;
/*
	this();
	- 오직 생성자에서 타 생성자 호출
	- 생성자 코드 첫라인 존재
	- 생성자 중, 하나 이상은 this()가 없는 생성자가 존재
*/
public class Ex12{
  public int speed;
  public final int MAX;
  public final String model;
  public String color;

  public Ex12(){
	this(0);
  }
  public Ex12(int mo){
	this(mo,"");
  }
  public Ex12(int mo, String color){
	if(mo==1){
		model="모닝";
		MAX=140;
		this.color=color;
	}else if(mo==2){
		model="아반떼";
		MAX=150;
		this.color=color;
	}else if(mo==3){
		model="소나타";
		MAX=180;
		this.color=color;
	}else{
		model="자동차";
		MAX=100;
		this.color="흰색";
	}
  }

  public static void main(String[] args){

  }

}