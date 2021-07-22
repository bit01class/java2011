package kr.co.joy.day18;

import java.util.*;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String title= "�л��������� ���α׷�(ver 0.8.1)";
		String menu="1.���� 2.�Է� 3.���� 4.���� 0.����";
		String[] sts={"����","����","����"};
		System.out.println(title);
		String input=null;
		Map<Integer,List<Integer>> map=new TreeMap<>();
		int num=0;
		while(true){
			System.out.print(menu+">>");
			input=sc.nextLine();
			if("0".equals(input)){break;}
			if("1".equals(input)){
				System.out.println("-----------------------------------");
				System.out.println("�й�\t����\t����\t����\t�հ�");
				System.out.println("-----------------------------------");
				Set<Integer> keys=map.keySet();
				Iterator<Integer> ite=keys.iterator();
				while(ite.hasNext()){
					int no=ite.next();
					List<Integer> stu=map.get(no);
					int sum=0;
					for(int i=0;i<stu.size(); i++){
						sum+=stu.get(i);
					}
					System.out.println(no+"\t"+stu.get(0)+"\t"+stu.get(1)
							+"\t"+stu.get(2)+"\t"+sum);
				}
			}
			if("2".equals(input)){
				System.out.print("�й�>>");
				num=Integer.parseInt(sc.nextLine());
				if(map.get(num)!=null){continue;}
				List<Integer> stu=new ArrayList<>();
				for(int i=0; i<sts.length; i++){
					System.out.print(sts[i]+">>");
					stu.add(Integer.parseInt(sc.nextLine()));
				}
				map.put(num, stu);
			}

			if("3".equals(input)){
				System.out.print("�й�>>");
				num=Integer.parseInt(sc.nextLine());
				if(map.get(num)==null){continue;}
				List<Integer> stu=new ArrayList<>();
				for(int i=0; i<sts.length; i++){
					System.out.print(sts[i]+">>");
					stu.add(Integer.parseInt(sc.nextLine()));
				}
				map.put(num, stu);
			}
			if("4".equals(input)){
				System.out.print("�й�>>");
				num=Integer.parseInt(sc.nextLine());
				if(map.get(num)==null){continue;}
				
				map.remove(num);
			}
		}//while end
	}// main end

}





