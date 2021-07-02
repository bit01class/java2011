class Ex01{

  public static void main(String[] args)
  {
	// 10진수 정수
	byte su1;
	short su2;
	int su3;
	long su4;
	su1=127;
	System.out.println(su1);
	su2=32767;
	System.out.println(su2);
	su3=2147483647;
	System.out.println(su3);
	su4=2147483648L;
	su4=su1;
	System.out.println(su4);
	int su5=su1+su2;
	System.out.println(su5);
	//강제형변환
	su2=129;
	byte su6=(byte)su2;
	System.out.println(su6);
	int su7;
	su7=012;
	System.out.println("8진수 012=10진수 "+su7);
	int su8;
	su8=0xa;
	System.out.println(su8);
  }
}





