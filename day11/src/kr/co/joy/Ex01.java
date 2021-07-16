package kr.co.joy;
// 단일 배열
// data[0] data[1] data[2]
// data[3] data[4] data[5]
public class Ex01 {

	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("학생성적관리프로그램(ver 0.2.0)\n---------------------------------\n총원>");
		int tot=sc.nextInt();
		int[] data=new int[tot*3];
		boolean boo=true;
		int idx=0;
		while(boo){
			System.out.print("1.보기 2.입력 0.종료>");
			int input=sc.nextInt();
			if(input==0){
				boo=false;
			}else if(input==1){
				System.out.println("-----------------------------------");
				System.out.println("학번	|국어	|영어	|수학	|합계");
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
				
				inputNum("국어",idx++,data);
				inputNum("영어",idx++,data);
				inputNum("수학",idx++,data);
				
			}else if(input==2){
				System.out.println("더이상 입력하실 학생이 없습니다");
			}
		}
		System.out.println("이용해주셔서 감사합니다");
	}
	
	// title에 해당한 과목을 0~100사이에 값으로 입력 받을 수 있는 기능
	public static void inputNum(String title,int idx,int[] data){
		int num=idx/3+1;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print(num+"번 "+title+">");
		data[idx]=sc.nextInt();
		while(data[idx]<0 || data[idx]>100){
			System.out.print("재입력\n"+num+"번 "+title+">");
			data[idx]=sc.nextInt();
		}
		
	}

}










