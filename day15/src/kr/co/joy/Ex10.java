package kr.co.joy;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// 학생성적관리프로그램(ver 0.5.0) - 배열
		// 1.보기 2.입력 3.수정 4.삭제 0.종료 >>
		// 입력된 만큼 출력
		// 중간을 삭제해도 학번이 연속되어야 함
		int[][] data=new int[5][];
		System.out.println("학생성적관리프로그램(ver 0.5.0)");
		Scanner sc=new Scanner(System.in);
		int input=0;
		int idx=0;
		while(true){
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료 >>");
			input=sc.nextInt();
			if(input==0){break;}
			if(input==1){
				System.out.println("-------------------------");
				System.out.println("학번\t국어\t영어\t수학");
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
				System.out.print("국어>");
				int kor=sc.nextInt();
				System.out.print("영어>");
				int eng=sc.nextInt();
				System.out.print("수학>");
				int math=sc.nextInt();
				data[idx++]=new int[]{kor,eng,math};
			}

			if(input==3){
				System.out.print("학번>");
				int num=sc.nextInt();
				System.out.print("국어>");
				int kor=sc.nextInt();
				System.out.print("영어>");
				int eng=sc.nextInt();
				System.out.print("수학>");
				int math=sc.nextInt();
				data[num-1]=new int[]{kor,eng,math};
			}
			if(input==4){
				System.out.print("학번 >");
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











