package kr.co.joy;

public class Ex09{

  public void func01(){
	System.out.println("func01() run...");
  }

  public void func02(Ex09 me2){
	this.func01();
	//Ex09 me=new Ex09();
	//System.out.println(me==this);
  }

  public static void main(String[] args){
	Ex09 me=new Ex09();
	me.func01();
	me.func02(me);
  }

}