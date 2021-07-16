package kr.co.joy;

public class Ex01 {
	
	class Ex111{}			//인스턴스 클래스
	static class Ex1111{}	// 스태틱 클래스
	
	public void func01(){
		class Ex11111{}		//로컬 클래스
	}

	public static void main(String[] args) {
		// 내부클래스
		// 1. 스태틱 내부클래스
		// 2. 인스턴스 클래스 (non-static class)
		// 3. 로컬 클래스(지역 클래스)
		// 4. 익명 클래스(anonymous class)
	}

}
