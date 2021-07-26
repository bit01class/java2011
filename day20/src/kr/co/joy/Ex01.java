package kr.co.joy;

import java.io.IOException;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) {
		// 
		System.out.println("콘솔에 출력");
		OutputStream os=System.out;
		try {
			os.write(65);
			os.write(66);
			os.write(67);
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
