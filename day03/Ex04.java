class Ex04{

public static void main(String[] args){

System.out.println("더조은 편의점");
System.out.println("-----------------");

System.out.println("--------------------------------------------------");

System.out.println("제품명	|단가	|수량	|계");

System.out.println("--------------------------------------------------");
int ea1,ea2,ea3,ea4;
ea1=10;
ea2=5;
ea3=3;
ea4=4;
System.out.println("생수	900	"+ea1+"	"+900*ea1);
System.out.println("쌀과자	2300	"+ea2+"	"+(2300*ea2));
System.out.println("껌	500	"+ea3+"	"+500*ea3);
System.out.println("커피	1200	"+ea4+"	"+1200*ea4);
System.out.println("--------------------------------------------------");
System.out.println("		합계:"+(900*ea1+(2300*ea2)+500*ea3+1200*ea4)+"원");
System.out.println("--------------------------------------------------");

}     

}