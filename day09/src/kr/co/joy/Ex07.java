package kr.co.joy;

public class Ex07 {

	public static void main(String[] args) {
		// 주민번호 검사기
		//1.////////////////////////////////
		// input="990131-1234567"
		// 결과 : 당신은 00세 남자입니다
		// input="010131-4234567"
		// 결과 : 당신은 00세 여자입니다
		////////////////////////////////////
		// 입력 : args[0]
		// a. 나이를 구하라
		// b. 성별을 구하라
		//2.////////////////////////////////
		// 입력오류시 오류메시지 출력
		// 오류 예시
		// 		"9901311234567"  -> -을 반드시 입력하세요
		// 		"990131-123456" -> 자리수가 부족합니다
		// 		"99013-11234567" -> 입력형식이 잘못되었습니다
		// 		"9901311-234567" -> 입력형식이 잘못되었습니다
		// 		"990131-a234567" -> 숫자가아닌 문자가 입력되었습니다
		// 		"aa0131-1234567" -> 숫자가아닌 문자가 입력되었습니다
		String input="990131-1234567";
		int age=0;
		char gender='여';
		char[] arr=input.toCharArray();
		boolean check1=false;
		boolean check4=true;
		for(int i=0; i<arr.length; i++){
			if(arr[i]=='-'){check1=true;}
		}
		
		for(int i=0; i<arr.length; i++){
			if(i!=6&&(arr[i]<'0'||arr[i]>'9')){
					check4=false;
			}
		}
		
		if(check1&&arr.length==14&&arr[6]=='-'&&check4){
			int year=(arr[0]-48)*10+(arr[1]-48);
			
			age=(2021-(2000+year)+1);
			if(arr[7]=='1'||arr[7]=='2'){
				age+=100;
			}
			if(arr[7]=='1'||arr[7]=='3'){
				gender='남';
			}
			System.out.println("당신은 "+age+"세 "+gender+"자 입니다");
		}else if(!check1){
			System.out.println("-을 반드시 입력하세요");
		}else if(arr.length!=14){
			System.out.println("자리수가 부족합니다");
		}else if(arr[6]!='-'){
			System.out.println("입력형식이 잘못되었습니다");
		}else if(!check4){
			System.out.println("숫자가 아닌 문자가 입력되었습니다");
		}
	}

}














