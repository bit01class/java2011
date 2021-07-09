package kr.co.tjoeun;

class Ex44{
  private static Ex44 ex44=new Ex44();

  private Ex44(){
	System.out.println("按眉积己");
  }

  public static Ex44 getEx44(){
	return ex44;
  }

  public void func01(){
	System.out.println("扁瓷角青");
  }
}

public class Ex04{

  public static void main(String[] args){
	Ex44 ex44=Ex44.getEx44();
	ex44.func01();
	ex44=Ex44.getEx44();	
	ex44.func01();
  }

}







