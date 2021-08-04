package kr.co.class01;

public class Ex11 {
	
	public static Number div(int a, int b){
		if(a%b==0){
			return a/b; // Number num=new Integer(a/b);
		}else{
			return a*1.0/b; // Number num=new Double(a*1.0/b);
		}
	}

	public static void main(String[] args) {
		System.out.println(div(5,2));
	}

}
