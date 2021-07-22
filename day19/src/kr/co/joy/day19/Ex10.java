package kr.co.joy.day19;

public class Ex10 {

	public static void main(String[] args) {
		try{
			System.out.println("실행중1");
			int su=1/0;
//			if(1==1){return;}
			System.out.println("실행중2");
		}catch(Exception e){
			System.out.println("에러있음");
		}finally{
			System.out.println("종료함");
		}
	}

}
