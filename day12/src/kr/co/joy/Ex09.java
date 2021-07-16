package kr.co.joy;

abstract interface Machine{
	public void on();
	public void off();
	public abstract void work();
}
class Tv implements Machine{
	public void on(){System.out.println("�Ѵ�");}
	public void off(){System.out.println("����");}
	public void work(){
		System.out.println("Ƽ��ȭ���� �����ִ�");
	}
}
class Radio implements Machine{
	public void on(){System.out.println("�Ѵ�");}
	public void off(){System.out.println("����");}
	public void work(){
		System.out.println("���ļ��� ��� �Ҹ��� ����ִ�");
	}
}
class Audio implements Machine{
	public void on(){System.out.println("�Ѵ�");}
	public void off(){System.out.println("����");}
	public void work(){
		System.out.println("������ ����ش�");
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
