package kr.co.joy;

public class Ex08 {

	public static void main(String[] args) {
		String input="990131-1234567";
		int age=0;
		char gender='��';
		char[] arr=input.toCharArray();
		boolean ck=true;
		for(int i=0; i<arr.length; i++){
			if(arr[i]=='-'){ck=false;}
		}
		if(ck){
			System.out.println("-�� �ݵ�� �Է��ϼ���");
			return;
		}
		if(arr.length!=14){
			System.out.println("�ڸ����� �����մϴ�");
			return;
		}
		if(arr[6]!='-'){
			System.out.println("�Է������� �߸��Ǿ����ϴ�");
			return;
		}
		for(int i=0; i<arr.length; i++){
			if(i!=6&&(arr[i]<'0'||arr[i]>'9')){
				System.out.println("���ڰ� �ƴ� ���ڰ� �ԷµǾ����ϴ�");
				return;
			}
		}
		
		int year=(arr[0]-48)*10+(arr[1]-48);
		
		age=(2021-(2000+year)+1);
		if(arr[7]=='1'||arr[7]=='2'){
			age+=100;
		}
		if(arr[7]=='1'||arr[7]=='3'){
			gender='��';
		}
		System.out.println("����� "+age+"�� "+gender+"�� �Դϴ�");

	}

}
