package kr.co.joy;

class Outter02{
	public static int su3=3333;
	public int su4=4444;
	
	public Outter02() {
		System.out.println("외부클래스 객체생성");
	}
	
	public static void func03(){
		System.out.println("외부클래스 static func03"+su3);
//		System.out.println("inner su1="+Inner02.su1);
//		Inner02.func01();
//		Inner02 inn=new Inner02();
//		System.out.println("inner su2="+inn.su2);
//		inn.func02();
	}
	public void func04(){
		System.out.println("외부클래스 non-static func04");
//		System.out.println("inner su1="+Inner02.su1);
//		Inner02.func01();
//		Inner02 inn=new Inner02();
//		System.out.println("inner su2="+inn.su2);
//		inn.func02();
	}
	
	public static class Inner02{
		public static int su1=1111;
		public int su2=2222;
		public static int su3=3000;
		
		public Inner02() {
			System.out.println("내부클래스 객체 생성");
		}
		
		public static void func01(){
//			System.out.println("내부클래스 스태틱 func01");
			System.out.println("outter su3="+su3);
			func03();
			Outter02 outt=new Outter02();
			System.out.println("outter su4="+outt.su4);
			outt.func04();
			
		}
		public void func02(){
//			System.out.println("내부클래스 func02");
			System.out.println("outter su3="+su3);
			func03();
			Outter02 outt=new Outter02();
			System.out.println("outter su4="+outt.su4);
			outt.func04();
		}
	}
}

public class Ex02 {


	public static void main(String[] args) {
		// 스태틱 클래스
		// 접근제한자 4가지 모두 사용가능
		System.out.println("inner su1="+kr.co.joy.Outter02.Inner02.su1);
		Outter02.Inner02.func01();
		
		Outter02.Inner02 inn=new Outter02.Inner02();
		System.out.println("inner su2="+inn.su2);
		inn.func02();
		System.out.println("---------------------------------");
		Outter02.func03();
		Outter02 outt=new Outter02();
		outt.func04();
	}

}











