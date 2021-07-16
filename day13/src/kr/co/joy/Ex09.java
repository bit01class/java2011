package kr.co.joy;

public class Ex09 {

	public static void main(String[] args) {
/*		 주민번호 검사기(ver 0.2.0)
*		 -----------------------------
*		주민번호 입력>>> 020101-4123456
*		당신은 20세 여성입니다
*
*		>>> 0201014123456		-> "주민번호형식은 123456-1234567입니다" 
*		>>> 02010-4123456		-> "입력된 자리수가 부족합니다"
*		>>> 020101-412345		-> "입력된 자리수가 부족합니다"
*		>>> 020101-a123456		-> "주민번호는 숫자로만 구성되어 있습니다"
*		000101~991231
*		1000000~4999999
*
*/		
		java.util.Scanner sc=new java.util.Scanner(System.in);
//		String input="990101-1123456";
		int age=0;
		char gender='여';
		for(int i=0; i<1; i++){
			System.out.print("주민번호>>>");
			String input=sc.nextLine();
			//valid
			String[] arr=input.split("-");
			if(arr.length==1){
				i=-1;
			}else{
				try{
					int before=Integer.parseInt(arr[0]);
					if(before<101||before>991231){
						i=-1;
					}
					int after=Integer.parseInt(arr[1]);
					if(after<1000000 || after>4999999){
						i=-1;
					}
				}catch(NumberFormatException e){
					i=-1;
				}
			}
			if(input.charAt(7)<'3'){	//				-1, -2	
				age=2022-Integer.parseInt("19"+input.substring(0,2));
			}else{						//				-3	-4
				age=2022-Integer.parseInt("20"+input.substring(0,2));
			}
			
			if((input.charAt(7)-'0')%2==1){gender='남';}
		}
		System.out.println("당신은 "+age+"세 "+gender+"성입니다");
	}

}






