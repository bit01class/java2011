package kr.co.joy;

import java.util.Scanner;

class Tarray{
	private Object[] arr=new Object[0];
	
	public int size(){
		return arr.length;
	}
	
	public Object get(int idx){
		return arr[idx];
	}
	
	public void add(Object su){
		Object[] temp=new Object[arr.length+1];
		for(int i=0; i<arr.length; i++){
			temp[i]=arr[i];
		}
		temp[temp.length-1]=su;
		arr=temp;
	}
	
	public void remove(int idx){
		Object[] temp=new Object[arr.length-1];
		// before
		for(int i=0; i<idx; i++){
			temp[i]=arr[i];
		}
		// after
		for(int i=idx; i<temp.length; i++){
			temp[i]=arr[i+1];
		}
		arr=temp;
	}
}

public class Ex02 {

	public static void main(String[] args) {
		System.out.println("학생성적관리 프로그램(ver 0.6.1)");
		Scanner sc=new Scanner(System.in);
		Tarray data=new Tarray();
		while(true){
			System.out.print("1.보기 2.입력 3.삭제 0.종료>");
			int input=sc.nextInt();
			if(input==0){break;}
			if(input==1){
				for(int i=0; i<data.size(); i++){
					System.out.println(i+1+"번 : "+data.get(i));
				}
			}
			if(input==2){
				System.out.print("성적 >>");
				data.add(sc.next());
			}
			if(input==3){
				System.out.print("학번 >>");
				data.remove(sc.nextInt()-1);
			}
		}
	}

}












