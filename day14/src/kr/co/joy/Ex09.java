package kr.co.joy;

public class Ex09 {

	public static void main(String[] args) {
		// �ֹι�ȣ Ȯ�����α׷�(ver 0.2.0)
		// �ֹι�ȣ �Է�>>> 123456-1234567
		System.out.println("�ֹι�ȣ Ȯ�����α׷�(ver 0.3.0)");
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String input;
		char gender='��';
		int year=1900;
		while(true){
			System.out.print("�ֹι�ȣ �Է�>>> ");
			input=sc.nextLine();
			if(input.indexOf("-")==-1){continue;}
			if(input.indexOf("-")!=6){continue;}
			if(input.length()!=14){continue;}
			boolean digit=false;
			for(int i=0; i<input.length(); i++){
				if(i==6){continue;}
				if(!Character.isDigit(input.charAt(i))){digit=true;}
			}
			if(digit){continue;}
			year+=Integer.parseInt(input.substring(0,2));
			if(input.charAt(7)=='3'||input.charAt(7)=='4'){year+=100;}
			if(input.charAt(7)=='1'||input.charAt(7)=='3'){gender='��';}
			break;
		}
		System.out.println("����� "+(2022-year)+"�� "+gender+"���Դϴ�");
		
	}
}








