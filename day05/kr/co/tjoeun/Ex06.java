//구구단1
package kr.co.tjoeun;

public class Ex06{

  public static void main(String[] args){
for(int su=1;su<10; su++){
  //System.out.println("2*"+su+"= 3*"+su+"= 4*"+su+"= 5*"+su+"= 6*"+su+"= ...");
	for(int dan=2;dan<10; dan++){
	System.out.print(dan+"*"+su+"="+dan*su+"\t");
	}
	System.out.println();
}
  }

}