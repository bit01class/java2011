class Ex07{

  public static void main(String[] args){
	// 제어문 - 2.반복문
	// do~while문
	/*	ⓐ
		do{
			실행문ⓑ;
		}while(조건문ⓒ);
		ⓓ
	ⓐⓑⓒ(true)ⓑⓒ(true)ⓑⓒ(true)ⓑⓒ(false)ⓓ
	*/
	int a=0;
	do{
		System.out.println(a);
	}while(++a<1);
  }

}


