package kr.co.joy;

public class Ex07 {

	public static void main(String[] args) {
		// �ֹι�ȣ �˻��
		//1.////////////////////////////////
		// input="990131-1234567"
		// ��� : ����� 00�� �����Դϴ�
		// input="010131-4234567"
		// ��� : ����� 00�� �����Դϴ�
		////////////////////////////////////
		// �Է� : args[0]
		// a. ���̸� ���϶�
		// b. ������ ���϶�
		//2.////////////////////////////////
		// �Է¿����� �����޽��� ���
		// ���� ����
		// 		"9901311234567"  -> -�� �ݵ�� �Է��ϼ���
		// 		"990131-123456" -> �ڸ����� �����մϴ�
		// 		"99013-11234567" -> �Է������� �߸��Ǿ����ϴ�
		// 		"9901311-234567" -> �Է������� �߸��Ǿ����ϴ�
		// 		"990131-a234567" -> ���ڰ��ƴ� ���ڰ� �ԷµǾ����ϴ�
		// 		"aa0131-1234567" -> ���ڰ��ƴ� ���ڰ� �ԷµǾ����ϴ�
		String input="990131-1234567";
		int age=0;
		char gender='��';
		char[] arr=input.toCharArray();
		boolean check1=false;
		boolean check4=true;
		for(int i=0; i<arr.length; i++){
			if(arr[i]=='-'){check1=true;}
		}
		
		for(int i=0; i<arr.length; i++){
			if(i!=6&&(arr[i]<'0'||arr[i]>'9')){
					check4=false;
			}
		}
		
		if(check1&&arr.length==14&&arr[6]=='-'&&check4){
			int year=(arr[0]-48)*10+(arr[1]-48);
			
			age=(2021-(2000+year)+1);
			if(arr[7]=='1'||arr[7]=='2'){
				age+=100;
			}
			if(arr[7]=='1'||arr[7]=='3'){
				gender='��';
			}
			System.out.println("����� "+age+"�� "+gender+"�� �Դϴ�");
		}else if(!check1){
			System.out.println("-�� �ݵ�� �Է��ϼ���");
		}else if(arr.length!=14){
			System.out.println("�ڸ����� �����մϴ�");
		}else if(arr[6]!='-'){
			System.out.println("�Է������� �߸��Ǿ����ϴ�");
		}else if(!check4){
			System.out.println("���ڰ� �ƴ� ���ڰ� �ԷµǾ����ϴ�");
		}
	}

}














