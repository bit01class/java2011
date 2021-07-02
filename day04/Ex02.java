class Ex02{

  public static void main(String[] args){
	// 제어문 - 2.반복문
	// 1.for문
	/*
		ⓐ
		for(초기화ⓑ;조건문ⓒ;증감식ⓓ){
			반복할 명령;ⓔ
		}
		ⓕ
	실행 ⓐ->ⓑ->ⓒ(true)->ⓔ
		->ⓓ->ⓒ(true)->ⓔ
		->ⓓ->ⓒ(true)->ⓔ
		->ⓓ->ⓒ(false)->ⓕ

	*/
	System.out.println("for문 전...");
	
	for(int i=0; i<5; i--){
	  System.out.println("실행"+i);
	}
	int i=100;
	System.out.println("for문 후..."+i);
  }

}









