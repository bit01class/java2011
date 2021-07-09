package kr.co.joy;

public class Ex04{
  /*
	클래스 구성요소
	2.변수(static-클래스변수, non-static,멤버필드, 인스턴스 변수)
  */
  public static int b=1111;
  public int c=2222;
  //System.out.println("오류");

  public static void main(String[] args){
	int a;
	a=1234;
	System.out.println("a="+a);
	System.out.println("b="+b);
	Ex04 me=new Ex04();
	System.out.println("c="+me.c);
  }

}