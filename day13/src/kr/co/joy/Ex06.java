package kr.co.joy;

public class Ex06 {

	public static void main(String[] args) {
		try{
			int a=0/Integer.parseInt("0");
			System.out.println(a);
		}catch(ArithmeticException err){
			System.out.println("0���� ���� �� �����ϴ�");
		}catch(NumberFormatException err){
			System.out.println("���ڿ��� ���ڷθ� �����Ǿ�� �մϴ�");
		}catch(Exception err){
			System.out.println("����");
		}

	}

}
