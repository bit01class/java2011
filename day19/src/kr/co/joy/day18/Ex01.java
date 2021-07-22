package kr.co.joy.day18;

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String title= "�л��������� ���α׷�(ver 0.8.1)";
		String menu="1.���� 2.�Է� 3.���� 4.���� 0.����";
		String[] sts={"����","����","����"};
		System.out.println(title);
		String input=null;
		List<int[]> list=new ArrayList<>();
		while(true){
			System.out.print(menu+">>");
			input=sc.nextLine();
			if(input.equals("0")){break;}
			if(input.equals("1")){
				System.out.println("--------------------------------------------");
				System.out.println("�й�\t����\t����\t����\t�հ�");
				System.out.println("--------------------------------------------");
				for(int i=0; i<list.size(); i++){
					int[] stu=list.get(i);
					int sum=stu[0]+stu[1]+stu[2];
					System.out.println(i+1+"\t"+stu[0]+"\t"+stu[1]+"\t"+stu[2]+"\t"+sum);
				}
			}
			if(input.equals("2")){
				int[] stu=new int[3];
				for(int i=0; i<sts.length; i++){
					System.out.print(sts[i]+">>");
					try{
					stu[i]=Integer.parseInt(sc.nextLine());
					}catch(NumberFormatException e){
						i--;
						continue;
					}
				}
				list.add(stu);
			}
			if(input.equals("3")){
				System.out.print("�й�>");
				int idx=-1;
				try{
					idx=Integer.parseInt(sc.nextLine())-1;
				}catch(NumberFormatException e){
					System.out.println("�й��� Ȯ���ϼ���");
					continue;
				}
				int[] stu=new int[3];
				for(int i=0; i<sts.length; i++){
					System.out.print(sts[i]+">>");
					try{
					stu[i]=Integer.parseInt(sc.nextLine());
					}catch(NumberFormatException e){
						i--;
						continue;
					}
				}
				list.set(idx,stu);
			}
			if(input.equals("4")){
				System.out.print("�й�>");
				int idx=-1;
				try{
					idx=Integer.parseInt(sc.nextLine())-1;
				}catch(NumberFormatException e){
					System.out.println("�й��� Ȯ���ϼ���");
					continue;
				}
				list.remove(idx);
			}
		}//while end
	}// main end

}









