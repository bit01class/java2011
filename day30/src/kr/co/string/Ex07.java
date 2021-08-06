package kr.co.string;

public class Ex07 {

	public static void main(String[] args) {
		String st1="홍길동@11@22@33!김개똥@44@55@66!이말자@77@88@99";

		String[] lines=st1.split("!");
//		System.out.println(java.util.Arrays.toString(lines));
		System.out.println("이름\t국어\t영어\t수학");
		for(int i=0; i<lines.length; i++){
			String line=lines[i];
			String[] stu=line.split("@");
//			System.out.println(java.util.Arrays.toString(stu));
			System.out.println(stu[0]+"\t"+stu[1]+"\t"+stu[2]+"\t"+stu[3]);
		}
	}

}
