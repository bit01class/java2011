package kr.co.joy;

public class Ex15 {
//	�й�\t����\t����\t����\n1\t10\t20\t30\n2\t40\t50\t60\n3\t90\t80\t70\n
//	�й�\t����\t����\t����\n1\t90\t80\t70\n2\t40\t50\t60\n


	public static void main(String[] args) {
		String data="�й�\t����\t����\t����\n";
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String input=null;
		int num=0;
		System.out.println("�л������������α׷�(0.3.0)");
		while(true){
			System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.���� >>");
			input=sc.nextLine();
			if(input.equals("0")){break;}
			if(input.equals("1")){
				System.out.println(data);
			}
			if(input.equals("2")){
				num++;
				data+=num+"\t";
				System.out.print("���� >>");
				data+=sc.nextLine()+"\t";
				System.out.print("���� >>");
				data+=sc.nextLine()+"\t";
				System.out.print("���� >>");
				data+=sc.nextLine()+"\n";
			}
			if(input.equals("3")){
				System.out.print("������ �й� >>");
				input=sc.nextLine();
				String find="\n"+input+"\t";
				int startIdx=data.indexOf(find)+1;
				int endIdx=data.indexOf("\n",startIdx);
				System.out.print("���� >>");
				input=input+"\t"+sc.nextLine();
				System.out.print("���� >>");
				input=input+"\t"+sc.nextLine();
				System.out.print("���� >>");
				input=input+"\t"+sc.nextLine();
				String before=data.substring(startIdx, endIdx);
				data=data.replace(before, input);
			}
			if(input.equals("4")){
				System.out.print("������ �й� >>");
				input=sc.nextLine();
				String find="\n"+input+"\t";
				int startIdx=data.indexOf(find);
				int endIdx=data.indexOf("\n",startIdx+1);
				String before=data.substring(startIdx, endIdx);
				data=data.replace(before, "");
			}
		}
		
	}

}
