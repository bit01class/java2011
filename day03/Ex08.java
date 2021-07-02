/*
문제] 아래의 출력으로 프로그램을 완성하세요
------------------------------
학생성적관리프로그램(ver 0.0.1)
-----------------------------------
국어:87	영어:93	수학 : 73
합계:000
평균:00.00	(소수 둘째자리까지만)
성적:B학점 
------------------------------------
단, 학점의 기준은 평균 
90.0~100		A 
80.0~90미만	B
70.0~80미만	C
60.0~60미만	D
60.0미만		F
*/

class Ex08
{
  public static void main(String[] args)
  {
	System.out.println("\n학생성적관리프로그램(ver 0.0.1)");
	System.out.println("--------------------------------");
	System.out.println();
	System.out.println("------------------------------------");
	int kor,eng,math;
	kor=87;
	eng=93;
	math=73;
	System.out.print("국어:"+kor);
	System.out.print("	영어:"+eng);
	System.out.println("	수학:"+math);
	System.out.println("------------------------------------");
	System.out.println("합계:"+(kor+eng+math));
	System.out.println("평균:"+(kor+eng+math)*100/3/100.0);
	if((kor+eng+math)/3.0>=90){	//90.0~100
	  System.out.println("A학점");
	}else if((kor+eng+math)/3.0>=80){	//80.0~90미만
	  System.out.println("B학점");
	}else if((kor+eng+math)/3.0>=70){	//70.0~80미만
	  System.out.println("C학점");
	}else if((kor+eng+math)/3.0>=60){	//60.0~70미만
	  System.out.println("D학점");
	}else{
	  System.out.println("F학점");
	}
	System.out.println("------------------------------------");
  }
}














