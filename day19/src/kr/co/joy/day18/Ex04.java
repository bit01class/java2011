package kr.co.joy.day18;

import java.util.*;

public class Ex04 {
	
	static class Student{
		static int cnt; 
		int num,kor,eng,math;
		String name;
		
		public Student() {
			cnt++;
			num=cnt;
		}
		public int sum(){
			return kor+eng+math;
		}
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String title= "학생성적관리 프로그램(ver 0.8.1)";
		String menu="1.보기 2.입력 3.수정 4.삭제 0.종료";
		String[] sts={"국어","영어","수학"};
		System.out.println(title);
		List<Student> list=new ArrayList<>();
		String input=null;
		while(true){
			System.out.print(menu+">");
			input=sc.nextLine();
			if("0".equals(input)){break;}
			if("1".equals(input)){
				System.out.println("----------------------------------------");
				System.out.println("학번\t이름\t국어\t영어\t수학\t합계");
				System.out.println("----------------------------------------");
				for(int i=0; i<list.size(); i++){
					Student stu = list.get(i);
					System.out.println(stu.num+"\t"+stu.name+"\t"+stu.kor+"\t"
										+stu.eng+"\t"+stu.math+"\t"+stu.sum());
				}
			}
			if("2".equals(input)){
				Student stu=new Student();
				System.out.print("이름>");
				stu.name=sc.nextLine();
				System.out.print(sts[0]+">");
				stu.kor=Integer.parseInt(sc.nextLine());
				System.out.print(sts[1]+">");
				stu.eng=Integer.parseInt(sc.nextLine());
				System.out.print(sts[2]+">");
				stu.math=Integer.parseInt(sc.nextLine());
				list.add(stu);
			}

			if("3".equals(input)){
				System.out.print("학번>");
				int num=Integer.parseInt(sc.nextLine());
				Student stu=null;
				for(int i=0; i<list.size(); i++){
					Student temp=list.get(i);
					if(temp.num==num){stu=temp;}
				}
				if(stu==null){continue;}
				System.out.print(sts[0]+">");
				stu.kor=Integer.parseInt(sc.nextLine());
				System.out.print(sts[1]+">");
				stu.eng=Integer.parseInt(sc.nextLine());
				System.out.print(sts[2]+">");
				stu.math=Integer.parseInt(sc.nextLine());
			}
			
			if("4".equals(input)){
				System.out.print("학번>");
				int num=Integer.parseInt(sc.nextLine());
				Student stu=null;
				for(int i=0; i<list.size(); i++){
					Student temp=list.get(i);
					if(temp.num==num){list.remove(i);}
				}
			}
			
		}//while end
	}// main end

}















