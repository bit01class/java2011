package kr.co.class01;

class Lec05{
	static void func01(){
		System.out.println("static func01()");
	}
	void func02(){
		System.out.println("non-static func02()");
	}
	
}

public class Ex05 {
	static void func03(){
		System.out.println("static func03()");
	}
	void func04(){
		System.out.println("non-static func04()");
	}
	static void func05(){
		System.out.println("static func05()");
	}
	void func06(){
		Lec05.func01();
		Lec05 lec=new Lec05();
		lec.func02();
		func03();
		func04();
	}

	public static void main(String[] args) {
		Lec05.func01();
		Lec05 lec=new Lec05();
		lec.func02();
		func03();
		Ex05 me=new Ex05();
		me.func04();
	}

}
