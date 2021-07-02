class Ex01{
  // 메서드
  // 1.static 메서드, 클래스 메서드
  // public static 자료형 메서드명(매개변수,인자,파라미터...){실행문;}
  // 실행은 메서드명();
  // 메서드명 - 명명규칙을 그대로 따른다(단 첫글자는 소문자)
  //		중복불가
  // void - return 값의 자료형이 존재하지 않을 경우, 
  // 		자료형자리는 void로 


  // 메서드 오버로드
  public static void func01(int a){
	System.out.println("매개변수 전달받음"+a);
  }
  public static int func01(){
	System.out.println("새롭게 만들어낸 기능1!");
	return 100;
  }

  public static void func02(char a){
	System.out.println("새로운기능2 - "+a);
	return;
  }

  public static void func03(int a, int b){
	System.out.println("새로운기능3 - "+(b+a));
	return;
  }

  public static int func04(){
	int x=100;
	int y=20;
	int z=x+y;
	return z;
  }

  public static void main(String[] args)
  {
	System.out.println("기존 코드작업...");
	func01(1234);
	System.out.println("기존코드 계속...");
	System.out.println(1);
	System.out.println(3.14);
	System.out.println(true);
	return;
  }

}	//Ex01 class End



