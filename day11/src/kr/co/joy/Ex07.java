package kr.co.joy;

class Machine{
	public void on(){
		System.out.println("켜다");
	}
	public void off(){
		System.out.println("끄다");
	}
	public void work(){System.out.println("동작");}
}
class Tv extends Machine{
	public void work(){
		System.out.println("방송을 화면이 보여준다");
	}
}
class Radio extends Machine{
	public void work(){
		System.out.println("주파수를 잡아 소리를 들려준다");
	}
}

class Audio extends Machine{
	public void work(){
		System.out.println("음악을 들려준다");
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
			System.out.print("1.Tv	2.Radio	3.Audio	0.종료 ?");
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









