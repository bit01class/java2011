package kr.co.joy;

public class Ex09 {

	public static void main(String[] args) {
/*		 �ֹι�ȣ �˻��(ver 0.2.0)
*		 -----------------------------
*		�ֹι�ȣ �Է�>>> 020101-4123456
*		����� 20�� �����Դϴ�
*
*		>>> 0201014123456		-> "�ֹι�ȣ������ 123456-1234567�Դϴ�" 
*		>>> 02010-4123456		-> "�Էµ� �ڸ����� �����մϴ�"
*		>>> 020101-412345		-> "�Էµ� �ڸ����� �����մϴ�"
*		>>> 020101-a123456		-> "�ֹι�ȣ�� ���ڷθ� �����Ǿ� �ֽ��ϴ�"
*		000101~991231
*		1000000~4999999
*
*/		
		java.util.Scanner sc=new java.util.Scanner(System.in);
//		String input="990101-1123456";
		int age=0;
		char gender='��';
		for(int i=0; i<1; i++){
			System.out.print("�ֹι�ȣ>>>");
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
			
			if((input.charAt(7)-'0')%2==1){gender='��';}
		}
		System.out.println("����� "+age+"�� "+gender+"���Դϴ�");
	}

}






