package kr.co.joy;

public class Ex12 {

	public static void main(String[] args) {
		// 주민번호 검사기(ver 0.4.0) - 한글지원 
		// 주민번호 >>> 영이영일영일-사일이삼사오육
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("주민번호 검사기(ver 0.4.0)");
		String input=null;
		char gender='여';
		int year=0;
		String[] arr2={"영","일","이","삼","사","오","육","칠","팔","구","하나","다섯","얼","이쯔","니"};
		String[] arr3={"0","1","2","3","4","5","6","7","8","9","1","5","2","1","2"};
		while(true){
		System.out.print("주민번호>");
			input=sc.nextLine();
//			char[] arr=input.toCharArray();
//			for(int i=0; i<arr.length; i++){
//				for(int j=0; j<arr2.length; j++){
//					if(arr[i]==arr2[j]){arr[i]=(char)(j+'0');}
//				}
//			}
//			input=new String(arr);
			for(int i=0; i<arr2.length; i++){
				input=input.replace(arr2[i], arr3[i]);
			}
			//valid
			year=Integer.parseInt(input.substring(0,2));
			if(input.charAt(7)>'2'){year+=100;}
			if('1'%2==input.charAt(7)%2){gender='남';}
			break;
		}
		System.out.println("당신은 "+(122-year)+"세 "+gender+"성입니다");
		
	}

}








