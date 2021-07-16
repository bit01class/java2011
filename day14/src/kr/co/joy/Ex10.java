package kr.co.joy;

public class Ex10 {

	public static void main(String[] args) {
		// 1~ 45 ทฃดýวั ผ๖
		// 0~44		+1
		// 0~<45.0
		int ran1=(int)(Math.random()*45)+1;
		int ran2=0;
		while(true){
			ran2=(int)(Math.random()*100);
			if(ran2>0&&ran2<=45){break;}
		}

	}

}






