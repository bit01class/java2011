package kr.co.joy;

public class Ex15 {
//	학번\t국어\t영어\t수학\n1\t10\t20\t30\n2\t40\t50\t60\n3\t90\t80\t70\n
//	학번\t국어\t영어\t수학\n1\t90\t80\t70\n2\t40\t50\t60\n


	public static void main(String[] args) {
		String data="학번\t국어\t영어\t수학\n";
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String input=null;
		int num=0;
		System.out.println("학생성적관리프로그램(0.3.0)");
		while(true){
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료 >>");
			input=sc.nextLine();
			if(input.equals("0")){break;}
			if(input.equals("1")){
				System.out.println(data);
			}
			if(input.equals("2")){
				num++;
				data+=num+"\t";
				System.out.print("국어 >>");
				data+=sc.nextLine()+"\t";
				System.out.print("영어 >>");
				data+=sc.nextLine()+"\t";
				System.out.print("수학 >>");
				data+=sc.nextLine()+"\n";
			}
			if(input.equals("3")){
				System.out.print("수정할 학번 >>");
				input=sc.nextLine();
				String find="\n"+input+"\t";
				int startIdx=data.indexOf(find)+1;
				int endIdx=data.indexOf("\n",startIdx);
				System.out.print("국어 >>");
				input=input+"\t"+sc.nextLine();
				System.out.print("영어 >>");
				input=input+"\t"+sc.nextLine();
				System.out.print("수학 >>");
				input=input+"\t"+sc.nextLine();
				String before=data.substring(startIdx, endIdx);
				data=data.replace(before, input);
			}
			if(input.equals("4")){
				System.out.print("삭제할 학번 >>");
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
