package kr.co.joy;

class Ex666{
	public Ex666() {
		System.out.println("�θ������");
	}
}

class Ex66{
	public Ex66() {
		this(0);
		System.out.println("non args ������");
	}
	public Ex66(int a){
		this(a,0);
		System.out.println("1 args ������"+a);
	}
	public Ex66(int a, int b){
		super();
		System.out.println("2 args ������"+a+","+b);
	}
	
}

public class Ex06 extends Ex66{
	
	public Ex06() {
		super(200);
	}

	public static void main(String[] args) {
		Ex06 ex66=new Ex06();

	}

}
