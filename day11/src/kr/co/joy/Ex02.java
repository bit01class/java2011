package kr.co.joy;
// ���� �迭
public class Ex02 {

	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("�л������������α׷�(ver 0.2.0)\n---------------------------------\n�ѿ�>");
		int tot=sc.nextInt();
		int[][] data=new int[tot][3];
		int num=0;
		boolean boo=true;
		while(boo){
			System.out.print("1.���� 2.�Է� 0.����>");
			int input=sc.nextInt();
			if(input==0){
				boo=false;
			}else if(input==1){
				System.out.println("-----------------------------------");
				System.out.println("�й�	|����	|����	|����	|�հ�");
				System.out.println("-----------------------------------");
				
				for(int i=0; i<data.length; i++){
					int[] stu=data[i];
					System.out.println(i+1+"\t"+stu[0]+"\t"+stu[1]
							+"\t"+stu[2]+"\t"+(stu[0]+stu[1]+stu[2]));
				}
				
			}else if(input==2){
				num++;
				int[] stu=data[num-1];
				System.out.print(num+"�� ����>");
				stu[0]=sc.nextInt();
				System.out.print(num+"�� ����>");
				stu[1]=sc.nextInt();
				System.out.print(num+"�� ����>");
				stu[2]=sc.nextInt();
			}
		}
		System.out.println("�̿����ּż� �����մϴ�");
	}

}










