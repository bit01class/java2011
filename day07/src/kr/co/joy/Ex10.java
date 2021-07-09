package kr.co.joy;

public class Ex10{
	// 전역 변수
  public int su=1111;

  public Ex10(int  su){
	this.su=su;	
  }
  public void func01(){
	// 지역 변수	
	int su;
	su=2222;
	System.out.println("func01 지역 su="+su);
	System.out.println("func01 전역 su="+this.su);
  }
  public static void main(String[] args){
	Ex10 me=new Ex10(3333);
	me.func01();
  }

}