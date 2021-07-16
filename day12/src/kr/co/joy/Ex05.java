package kr.co.joy;

public class Ex05 {

	public static void main(String[] args) {
		System.out.println("main start..");
		func();
//		int su=0;
//		boolean boo=true;
//		while(boo){
//			switch (su) {
//			case 5:
//				boo=false;
//				break;
//			}
//			su++;
//		}
		System.out.println("main end...");
	}
	
	public static void func(){
		for(int i=0; i<10; i++){
			if(i%2==1){
//				System.out.println("종료?");
//				return;
//				break;
				continue;
			}
			
			System.out.println(i+1+"번 출력");
		}
	}

}
