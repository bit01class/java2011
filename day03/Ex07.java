class Ex07{

  public static void main(String[] args){
    // 제어문 - 1.조건문(switch문)
    // switch(value){
    //     case val1:	실행문;	break;
    //     case val2:	실행문;	break;
    //     case val3:	실행문;	break;
    //     default : 실행문;
    // }
    System.out.println("switch문");
    String st="문자";
    switch(st+"열"){
	case "문자":
	System.out.println("1입니다");
	break;
	case "문자열":
	System.out.println("2입니다");
	break;
	case "문자니":System.out.println("3입니다");break;
	default: System.out.println("몰라");
    }
    System.out.println("끝");
  }

}