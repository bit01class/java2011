package kr.co.joy;

class Machine{
	public void on(){
		System.out.println("�Ѵ�");
	}
	public void off(){
		System.out.println("����");
	}
	public void work(){System.out.println("����");}
}
class Tv extends Machine{
	public void work(){
		System.out.println("����� ȭ���� �����ش�");
	}
}
class Radio extends Machine{
	public void work(){
		System.out.println("���ļ��� ��� �Ҹ��� ����ش�");
	}
}

class Audio extends Machine{
	public void work(){
		System.out.println("������ ����ش�");
	}
}

public class Ex07 {

	public static void main(String[] args) {
//		Tv tv=new Tv();
//		tv.on();
//		tv.work();
//		tv.off();
//
//		Radio ra=new Radio();
//		ra.on();
//		ra.work();
//		ra.off();
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int input=-1;
		Machine remote=null;
		
		while(input!=0){
			System.out.print("1.Tv	2.Radio	3.Audio	0.���� ?");
			input=sc.nextInt();
			if(input==1){
				remote=new Tv();
			}else if(input==2){
				remote=new Radio();
			}else if(input==3){
				remote=new Audio();
			}		
			remote.on();
			remote.work();
			remote.off();		
		}
	}

}









