package kr.co.joy;

class Outter03{
	public static int su1=1111;
	public int su2=2222;
	public Outter03() {
		System.out.println("New Outter");
	}
	public static void func01(){
		System.out.println("Outter static func01");
//		Outter03 me=new Outter03();
//		Inner03 inn=me.new Inner03();
//		System.out.println("su3="+Inner03.su3);
//		System.out.println("su4="+inn.su4);
//		inn.func04();
	}
	public void func02(){
		System.out.println("Outter func02");
//		Inner03 inn=new Inner03();
//		System.out.println("su3="+Inner03.su3);
//		System.out.println("su4="+inn.su4);
//		inn.func04();
	}
	
	public class Inner03{
		public final static int su3=3333;
		public int su4=4444;
		public Inner03() {
		}
//		public static void func03(){}
		public void func04(){
			System.out.println("inner func04");
//			System.out.println("su1="+su1);
//			func01();
//			System.out.println("su2="+su2);
//			func02();
		}
	}
}


public class Ex03 {

	public static void main(String[] args) {
		System.out.println("su3="+Outter03.Inner03.su3);
		Outter03 outt=new Outter03();
		Outter03.Inner03 inn=outt.new Inner03();
		System.out.println("su4="+inn.su4);
		inn.func04();
	}

}











