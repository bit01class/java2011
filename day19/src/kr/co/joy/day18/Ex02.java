package kr.co.joy.day18;

import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String title= "�л��������� ���α׷�(ver 0.8.1)";
		String menu="1.���� 2.�Է� 3.���� 4.���� 0.����";
		String[] sts={"����","����","����"};
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
				System.out.println("�й�\t����\t����\t����\t�հ�");
				System.out.println("-------------------------------------");
				for(int i=0; i<list.size(); i++){
					Map<String, Integer> stu = list.get(i);
					int sum=stu.get("����")+stu.get("����")+stu.get("����");
					System.out.println(i+1+"\t"+stu.get("����")
							+"\t"+stu.get("����")+"\t"+stu.get("����")+"\t"+sum);
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
				System.out.print("�й�>");
				int idx=Integer.parseInt(sc.nextLine())-1;
				Map<String,Integer> stu=new HashMap<>();
				for(int i=0; i<sts.length; i++){
					System.out.print(sts[i]+">>");
					stu.put(sts[i], Integer.parseInt(sc.nextLine()));
				}
				list.set(idx,stu);
			}
			if(input.equals("4")){
				System.out.print("�й�>");
				int idx=Integer.parseInt(sc.nextLine())-1;
				list.remove(idx);
			}
			}catch(NumberFormatException e){
				System.out.println("���ڸ� ��Ȯ�� �Է��ϼ���");
			}
		}//while end
	}// main end

}







