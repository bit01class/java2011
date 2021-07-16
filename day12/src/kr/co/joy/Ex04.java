package kr.co.joy;

class Ex444{
	String id;
}

public class Ex04 extends Ex444{
	String id;
	public String getId(){ return id;}
	public void setId(String id){
		this.id=id;
	}

	public static void main(String[] args) {
		Ex04 bean=new Ex04();
		bean.setId("abcd");
		System.out.println(bean.getId());
	}

}
