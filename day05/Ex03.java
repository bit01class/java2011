https://github.com/bit01class

class Ex03{
  public static void func01(){
	int a;
	a=100;
	Ex03.func01();	
	System.out.println("main a="+a);
  }

  public static void main(String[] args){
	func01();
  }

}