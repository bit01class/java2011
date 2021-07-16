package kr.co.joy;

abstract interface Machine{
	public void on();
	public void off();
	public abstract void work();
}
class Tv implements Machine{
	public void on(){System.out.println("켜다");}
	public void off(){System.out.println("끄다");}
	public void work(){
		System.out.println("티비화면을 보여주다");
	}
}
class Radio implements Machine{
	public void on(){System.out.println("켜다");}
	public void off(){System.out.println("끄다");}
	public void work(){
		System.out.println("주파수를 잡아 소리를 들려주다");
	}
}
class Audio implements Machine{
	public void on(){System.out.println("켜다");}
	public void off(){System.out.println("끄다");}
	public void work(){
		System.out.println("음악을 들려준다");
	}
}

public class Ex09 {

	public static void main(String[] args) {
		Machine remote=new Tv();
		remote.on();
		remote.work();
		remote.off();

	}

}
