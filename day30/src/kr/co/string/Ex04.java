package kr.co.string;

public class Ex04 {

	public static void main(String[] args) {
		String st1="java";

		//�ڷκ��̰�
		System.out.println(st1.concat("World"));
		System.out.println(st1+"World");
		//�߰����߰�
		System.out.println(st1.replace("av", "aZv"));
		//����
		System.out.println(st1.replace('v', 'V'));
		//����
		System.out.println(st1.replace("jav","jv"));
	}

}
