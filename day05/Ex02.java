class Ex02{

 public static void func01(){
	System.out.println("내기능 f1()...");
 }

 public static void main(String[] args){
	System.out.println("call Ex01 func01");
	func01();
	Ex01.func01();
	the.Ex01.func01();
	the.joy.Ex01.func01();
 }
}