package kr.co.joy.day19;

public class Ex10 {

	public static void main(String[] args) {
		try{
			System.out.println("������1");
			int su=1/0;
//			if(1==1){return;}
			System.out.println("������2");
		}catch(Exception e){
			System.out.println("��������");
		}finally{
			System.out.println("������");
		}
	}

}
