package kr.co.joy;

class Ex1111{
	// 캡슐화
	private String id="";
	private String pw="";
	
	public String getId(){
		return id;
	}
	
	public void setId(String id){
		this.id=id;
	}
	
//	public String getConnection(){
//		return id+pw+"접속된 연결";
//	}
}

class Ex111{
	int su=1111;
	void func01(){
		System.out.println("기능1");
	}
	void func02(){}
}

public class Ex01 extends Ex111 {
	// 상속
	// - 오버라이드
	// - 다형성
	// - final
	
	void func02(){
		System.out.println("수정된 기능2");
		
		
	}

	public static void main(String[] args) {
		

	}

}
