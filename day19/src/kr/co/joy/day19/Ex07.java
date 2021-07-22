package kr.co.joy.day19;

import java.io.File;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) {
		// 임시파일
		String prefix="tjoeun";
		String suffix=".txt";
		File file=null;
		try {
			file=File.createTempFile(prefix, suffix);
			System.out.println(file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		file.delete();
	}

}
