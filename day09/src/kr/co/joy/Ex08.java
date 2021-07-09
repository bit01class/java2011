package kr.co.joy;

public class Ex08 {

	public static void main(String[] args) {
		String input="990131-1234567";
		int age=0;
		char gender='여';
		char[] arr=input.toCharArray();
		boolean ck=true;
		for(int i=0; i<arr.length; i++){
			if(arr[i]=='-'){ck=false;}
		}
		if(ck){
			System.out.println("-을 반드시 입력하세요");
			return;
		}
		if(arr.length!=14){
			System.out.println("자리수가 부족합니다");
			return;
		}
		if(arr[6]!='-'){
			System.out.println("입력형식이 잘못되었습니다");
			return;
		}
		for(int i=0; i<arr.length; i++){
			if(i!=6&&(arr[i]<'0'||arr[i]>'9')){
				System.out.println("숫자가 아닌 문자가 입력되었습니다");
				return;
			}
		}
		
		int year=(arr[0]-48)*10+(arr[1]-48);
		
		age=(2021-(2000+year)+1);
		if(arr[7]=='1'||arr[7]=='2'){
			age+=100;
		}
		if(arr[7]=='1'||arr[7]=='3'){
			gender='남';
		}
		System.out.println("당신은 "+age+"세 "+gender+"자 입니다");

	}

}
