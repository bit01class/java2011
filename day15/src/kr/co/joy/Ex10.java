package kr.co.joy;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// �л������������α׷�(ver 0.5.0) - �迭
		// 1.���� 2.�Է� 3.���� 4.���� 0.���� >>
		// �Էµ� ��ŭ ���
		// �߰��� �����ص� �й��� ���ӵǾ�� ��
		int[][] data=new int[5][];
		System.out.println("�л������������α׷�(ver 0.5.0)");
		Scanner sc=new Scanner(System.in);
		int input=0;
		int idx=0;
		while(true){
			System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.���� >>");
			input=sc.nextInt();
			if(input==0){break;}
			if(input==1){
				System.out.println("-------------------------");
				System.out.println("�й�\t����\t����\t����");
				System.out.println("-------------------------");
				int cnt=0;
				while(true){
					int[] stu=null;
					try{
						stu=data[cnt++];
					}catch(ArrayIndexOutOfBoundsException e){
						break;
					}
					if(stu==null){break;}
					System.out.print(cnt+"\t");
					for(int i=0; i<stu.length; i++){
						System.out.print(stu[i]+"\t");
					}
					System.out.println();
				}
			}
			if(input==2){
				System.out.print("����>");
				int kor=sc.nextInt();
				System.out.print("����>");
				int eng=sc.nextInt();
				System.out.print("����>");
				int math=sc.nextInt();
				data[idx++]=new int[]{kor,eng,math};
			}

			if(input==3){
				System.out.print("�й�>");
				int num=sc.nextInt();
				System.out.print("����>");
				int kor=sc.nextInt();
				System.out.print("����>");
				int eng=sc.nextInt();
				System.out.print("����>");
				int math=sc.nextInt();
				data[num-1]=new int[]{kor,eng,math};
			}
			if(input==4){
				System.out.print("�й� >");
				int num=sc.nextInt()-1;
				int[][] data2=new int[5][];
				//copy
				for(int i=0; i<num; i++){
					System.arraycopy(data, 0, data2, 0, num);
				}
				for(int i=num+1; i<data.length; i++){
					System.arraycopy(data, num+1, data2, num, data.length-(num+1));
				}
				data=data2;
				
//				while(true){
//					if(num==data.length-1){
//						data[num]=null;
//						break;
//					}
//					data[num]=data[num+1];
//					num++;
//				}
			}
		}
		
	}

}











