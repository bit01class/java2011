package kr.co.joy;

public class Ex11{
  public int su;

  public Ex11(){
	this(1111);	
  }
  public Ex11(int su){
	this.su=su;
  }
  public static void main(String[] args){
	Ex11 me=new Ex11();
	System.out.println(me.su);
  }

}