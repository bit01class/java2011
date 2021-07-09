package kr.co.joy;

class Ex02{
	// 접근제한자(3/4)
	// class(public,default) 메서드(3) 전역변수(3) 생성자(3)

	// public , default, private
	// public 어디서든 접근가능
	// default 동일패키지에서만 접근가능
	// private 클래스 내부에서만 접근가능
	public int su1=1111;
	int su2=2222;
	private int su3=3333;

  public Ex02(){}

  public static void func01(){
	System.out.println("public func01");
  }
  static void func02(){
	System.out.println("default func02");
  }
  private static void func03(){
	System.out.println("private func03");
  }

  public static void main(String[] args){
	Ex02 me=new Ex02();
	//func01();
	//func02();
	//func03();
	System.out.println(me.su1);
	System.out.println(me.su2);
	System.out.println(me.su3);
  }
}








