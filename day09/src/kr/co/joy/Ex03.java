package kr.co.joy;

public class Ex03 {
	static String msg0;

	public static void main(String[] args) {
		// ���ڿ�
		String msg1="���ڿ�";
		String msg2=new String();	// ""
		System.out.println(msg2);
		System.out.println(msg0);
		String msg3=new String("���ڿ�");
		String msg4=new String("���ڿ�");
		System.out.println(msg3);
		System.out.println(msg4);
		System.out.println(msg3==msg4);
		System.out.println(msg1==msg3);
		String msg5="���ڿ�";
		System.out.println(msg1==msg5);
		String msg6="����";
		String msg7="��";
		String msg8=msg6+msg7;
		System.out.println(msg1==msg8);
		String msg9="����"+"��";
		System.out.println(msg1==msg9);
		// ref ��
		System.out.println("--------------");
		// value�� ��
		System.out.println(msg1.equals(msg3));
		System.out.println(msg1.equals(msg4));
		System.out.println(msg1.equals(msg5));
		System.out.println(msg1.equals(msg8));
		System.out.println(msg1.equals(msg9));
	}

}







