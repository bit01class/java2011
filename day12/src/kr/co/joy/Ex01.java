package kr.co.joy;

class Ex1111{
	// ĸ��ȭ
	private String id="";
	private String pw="";
	
	public String getId(){
		return id;
	}
	
	public void setId(String id){
		this.id=id;
	}
	
//	public String getConnection(){
//		return id+pw+"���ӵ� ����";
//	}
}

class Ex111{
	int su=1111;
	void func01(){
		System.out.println("���1");
	}
	void func02(){}
}

public class Ex01 extends Ex111 {
	// ���
	// - �������̵�
	// - ������
	// - final
	
	void func02(){
		System.out.println("������ ���2");
		
		
	}

	public static void main(String[] args) {
		

	}

}
