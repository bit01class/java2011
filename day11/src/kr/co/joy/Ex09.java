package kr.co.joy;
/*
 * �л������������α׷�(ver 0.2.0) ���ڿ�(�����Ҵ�)
 * ---------------------------------
 * 
 * 1.���� 2.�Է� 0.����>1
 * -----------------------------------
 * �й�	|����	|����	|����	|�հ�
 * -----------------------------------
 * 1		0		0		0		0  ~~~~~
 * 1.���� 2.�Է� 0.����>2
 * 1�� ����>90
 * 1�� ����>80
 * 1�� ����>70
 * 
 * 1.���� 2.�Է� 0.����>1
 * -----------------------------------
 * �й�	|����	|����	|����	|�հ�
 * -----------------------------------
 * 1	 90		 80		 70		 000
*/
public class Ex09 {

	public static void main(String[] args) {
		String data="-----------------------------------\n�й�	|����	|����	|����	|�հ�\n-----------------------------------\n";
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		String input="";
		int num=0;
		while(input!=null){
			System.out.print("1.����  2.�Է�  0.����?");
			input=sc.nextLine();
			if(input.equals("0")){
				input=null;
			}else if(input.equals("1")){
				System.out.println(data);
			}else if(input.equals("2")){
				data+=++num+"\t";
				System.out.print("����>");
				input=sc.nextLine();
				int kor=Integer.parseInt(input);
				data+=input;
				data+="\t";//data=data+"\t";
				System.out.print("����>");
				input=sc.nextLine();
				int eng=Integer.parseInt(input);
				data+=input+"\t";
				System.out.print("����>");
				input=sc.nextLine();
				int math=Integer.parseInt(input);
				data+=input+"\t";
				data+=(kor+eng+math)+"\n";
			}
			
		}
	}

}
