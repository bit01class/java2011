package kr.co.joy;

public class Ex05 {

	public static void main(String[] args) {
		try{
			Ex05 me=new Ex05();
//			me.clone();
			int a=0/0;
//			System.out.println(a);
		}catch(Exception err){
			System.out.println("에러 회피");
//			err.printStackTrace();
			System.out.println(err.getClass());
		}

	}

}
