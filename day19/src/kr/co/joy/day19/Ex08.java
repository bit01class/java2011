package kr.co.joy.day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex08 {

	public static void main(String[] args) {
		// output stream
		// \n -> 10
		// \r\n -> 13 10 window°³Çà
		
		
		File file=new File("test08.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileOutputStream os=new java.io.FileOutputStream(file);
			os.write('a');
			os.write('b');
			os.write('\n');
			os.write('c');
			os.write('d');
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}







