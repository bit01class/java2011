package kr.co.joy;

public class Ex05{
  // 전역변수 - 디폴트 값을 대입하지 않아도 사용가능
  // 객체지향 java - 클래스변수, 멤버필드
  public static int a=1111;
  public static int b;
  public int d;
  public static String e=null;
  public static int f=0;
  public static double g=0.0;
  public static boolean h=false;
  public static char i='\u0000';

  public static void main(String[] args){
	System.out.println(e+"?");
	// 변수
	// 전역변수 & 지역변수
	int c=3333; // 지역변수
	Ex05 me=new Ex05();
	System.out.println("d="+me.d);
	me.func02();	
  }	
  
  public void func02(){
	System.out.println("func02 d="+d);
  }

  public static void func01(){
	a=3333;
	System.out.println("func01 a="+a);	
	System.out.println("func01 b="+b);
  }

}