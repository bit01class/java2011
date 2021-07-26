package kr.co.joy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex05 {

	public static void main(String[] args) {
		String path=".\\test01\\ex02.txt";
		File file=new File(path);
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		OutputStream os=null;
		try {
			os=new FileOutputStream(file);
			os.write("Hello world".getBytes());
			System.out.println("작성완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(os!=null){os.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
