package kr.co.joy;
// ���� �迭
// data[0] data[1] data[2]
// data[3] data[4] data[5]
public class Ex01 {

	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("�л������������α׷�(ver 0.2.0)\n---------------------------------\n�ѿ�>");
		int tot=sc.nextInt();
		int[] data=new int[tot*3];
		boolean boo=true;
		int idx=0;
		while(boo){
			System.out.print("1.���� 2.�Է� 0.����>");
			int input=sc.nextInt();
			if(input==0){
				boo=false;
			}else if(input==1){
				System.out.println("-----------------------------------");
				System.out.println("�й�	|����	|����	|����	|�հ�");
				System.out.println("-----------------------------------");
				int num=1;
				for(int i=0; i<data.length; i++){
					if(i%3==0){System.out.print(num+++"\t");}
					System.out.print(data[i]+"\t");
					
					if(i%3==2){
						int sum=data[i-2]+data[i-1]+data[i];
						System.out.println(sum);
					}
				}
				
			}else if(input==2&&idx<tot*3){
				
				inputNum("����",idx++,data);
				inputNum("����",idx++,data);
				inputNum("����",idx++,data);
				
			}else if(input==2){
				System.out.println("���̻� �Է��Ͻ� �л��� �����ϴ�");
			}
		}
		System.out.println("�̿����ּż� �����մϴ�");
	}
	
	// title�� �ش��� ������ 0~100���̿� ������ �Է� ���� �� �ִ� ���
	public static void inputNum(String title,int idx,int[] data){
		int num=idx/3+1;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print(num+"�� "+title+">");
		data[idx]=sc.nextInt();
		while(data[idx]<0 || data[idx]>100){
			System.out.print("���Է�\n"+num+"�� "+title+">");
			data[idx]=sc.nextInt();
		}
		
	}

}










