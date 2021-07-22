package kr.co.joy.day18;

import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String title= "학생성적관리 프로그램(ver 0.8.1)";
		String menu="1.보기 2.입력 3.수정 4.삭제 0.종료";
		String[] sts={"국어","영어","수학"};
		System.out.println(title);
		List<Map<String,Integer>> list=new ArrayList<>();
		String input=null;
		while(true){
			System.out.print(menu+">>");
			input=sc.nextLine();
			if(input.equals("0")){
				break;
			}
			if(input.equals("1")){
				System.out.println("-------------------------------------");
				System.out.println("학번\t국어\t영어\t수학\t합계");
				System.out.println("-------------------------------------");
				for(int i=0; i<list.size(); i++){
					Map<String, Integer> stu = list.get(i);
					int sum=stu.get("국어")+stu.get("영어")+stu.get("수학");
					System.out.println(i+1+"\t"+stu.get("국어")
							+"\t"+stu.get("영어")+"\t"+stu.get("수학")+"\t"+sum);
				}
			}
			try{
			if(input.equals("2")){
				Map<String,Integer> stu=new HashMap<>();
				for(int i=0; i<sts.length; i++){
					System.out.print(sts[i]+">>");
					stu.put(sts[i], Integer.parseInt(sc.nextLine()));
				}
				list.add(stu);
			}
			if(input.equals("3")){
				System.out.print("학번>");
				int idx=Integer.parseInt(sc.nextLine())-1;
				Map<String,Integer> stu=new HashMap<>();
				for(int i=0; i<sts.length; i++){
					System.out.print(sts[i]+">>");
					stu.put(sts[i], Integer.parseInt(sc.nextLine()));
				}
				list.set(idx,stu);
			}
			if(input.equals("4")){
				System.out.print("학번>");
				int idx=Integer.parseInt(sc.nextLine())-1;
				list.remove(idx);
			}
			}catch(NumberFormatException e){
				System.out.println("숫자를 정확히 입력하세요");
			}
		}//while end
	}// main end

}







