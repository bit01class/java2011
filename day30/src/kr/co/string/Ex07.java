package kr.co.string;

public class Ex07 {

	public static void main(String[] args) {
		String st1="ȫ�浿@11@22@33!�谳��@44@55@66!�̸���@77@88@99";

		String[] lines=st1.split("!");
//		System.out.println(java.util.Arrays.toString(lines));
		System.out.println("�̸�\t����\t����\t����");
		for(int i=0; i<lines.length; i++){
			String line=lines[i];
			String[] stu=line.split("@");
//			System.out.println(java.util.Arrays.toString(stu));
			System.out.println(stu[0]+"\t"+stu[1]+"\t"+stu[2]+"\t"+stu[3]);
		}
	}

}
