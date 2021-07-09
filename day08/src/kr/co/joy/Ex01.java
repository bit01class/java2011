package kr.co.joy;

public class Ex01{

  public static void main(String[] args){
	int a=0,b=0,c=0;
	int input=0;
	int com=0;
	String com2="";
	String you2="";
	String menu="가위(1),바위(2),보(3),종료(0)>>>";
	java.util.Scanner sc=new java.util.Scanner(System.in);
	boolean boo2=true;

	System.out.println("가위바위보게임(ver 0.1.0)");
	while(boo2){
	System.out.print(menu);
	input=sc.nextInt();
	if(input==0){boo2=false;
	}else{
	com=(int)(Math.random()*3)+1; // 1~3
	if(com==1){	com2="가위";
	}else if(com==2){com2="바위";
	}else if(com==3){com2="보";}
	if(input==1){you2="가위";
	}else if(input==2){you2="바위";
	}else if(input==3){you2="보";}
	System.out.println("com:"+com2+", you:"+you2);

	if(com==input){
		b++;
		System.out.println("비겼습니다");
	}else if((input==1 && com==3)
			||(input==2 && com==1)
			||(input==3 && com==2)){
		a++;
		System.out.println("이겼습니다");
	}else{
		c++;
		System.out.println("졌습니다");
	}// if(졌을때) end
	}// if(input!=0) end
	}//while end
	System.out.println("승률 - "+a+"승"+b+"무"+c+"패");
	System.out.println("이용해주셔서 감사합니다");
  }// main end

}//class end







