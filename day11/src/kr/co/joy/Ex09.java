package kr.co.joy;
/*
 * 학생성적관리프로그램(ver 0.2.0) 문자열(동적할당)
 * ---------------------------------
 * 
 * 1.보기 2.입력 0.종료>1
 * -----------------------------------
 * 학번	|국어	|영어	|수학	|합계
 * -----------------------------------
 * 1		0		0		0		0  ~~~~~
 * 1.보기 2.입력 0.종료>2
 * 1번 국어>90
 * 1번 영어>80
 * 1번 수학>70
 * 
 * 1.보기 2.입력 0.종료>1
 * -----------------------------------
 * 학번	|국어	|영어	|수학	|합계
 * -----------------------------------
 * 1	 90		 80		 70		 000
*/
public class Ex09 {

	public static void main(String[] args) {
		String data="-----------------------------------\n학번	|국어	|영어	|수학	|합계\n-----------------------------------\n";
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		String input="";
		int num=0;
		while(input!=null){
			System.out.print("1.보기  2.입력  0.종료?");
			input=sc.nextLine();
			if(input.equals("0")){
				input=null;
			}else if(input.equals("1")){
				System.out.println(data);
			}else if(input.equals("2")){
				data+=++num+"\t";
				System.out.print("국어>");
				input=sc.nextLine();
				int kor=Integer.parseInt(input);
				data+=input;
				data+="\t";//data=data+"\t";
				System.out.print("영어>");
				input=sc.nextLine();
				int eng=Integer.parseInt(input);
				data+=input+"\t";
				System.out.print("수학>");
				input=sc.nextLine();
				int math=Integer.parseInt(input);
				data+=input+"\t";
				data+=(kor+eng+math)+"\n";
			}
			
		}
	}

}
