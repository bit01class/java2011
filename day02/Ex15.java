class Ex15{
  public static void main(String[] args){
    int a;
    a=5;
    System.out.println(true);
    System.out.println(false);
    // 비교연산자
    System.out.println(a>3);
    System.out.println(a<3);
    System.out.println(a>=3);
    System.out.println(a<=3);
    System.out.println(a==3);
    System.out.println(a!=3);


    boolean boo;
    boo=false;
    System.out.println("논리연산자");

    System.out.println("이항논리연산자(and, or)");
    System.out.println(boo && true);
    System.out.println(boo && false);
    System.out.println(boo || true);
    System.out.println(boo || false);

    System.out.println("단항논리연산자(not)");
    System.out.println(!(boo));

    System.out.println(boo);
  }
}








