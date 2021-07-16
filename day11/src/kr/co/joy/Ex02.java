package kr.co.joy;
// 다중 배열
public class Ex02 {

	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("학생성적관리프로그램(ver 0.2.0)\n---------------------------------\n총원>");
		int tot=sc.nextInt();
		int[][] data=new int[tot][3];
		int num=0;
		boolean boo=true;
		while(boo){
			System.out.print("1.보기 2.입력 0.종료>");
			int input=sc.nextInt();
			if(input==0){
				boo=false;
			}else if(input==1){
				System.out.println("-----------------------------------");
				System.out.println("학번	|국어	|영어	|수학	|합계");
				System.out.println("-----------------------------------");
				
				for(int i=0; i<data.length; i++){
					int[] stu=data[i];
					System.out.println(i+1+"\t"+stu[0]+"\t"+stu[1]
							+"\t"+stu[2]+"\t"+(stu[0]+stu[1]+stu[2]));
				}
				
			}else if(input==2){
				num++;
				int[] stu=data[num-1];
				System.out.print(num+"번 국어>");
				stu[0]=sc.nextInt();
				System.out.print(num+"번 영어>");
				stu[1]=sc.nextInt();
				System.out.print(num+"번 수학>");
				stu[2]=sc.nextInt();
			}
		}
		System.out.println("이용해주셔서 감사합니다");
	}

}










