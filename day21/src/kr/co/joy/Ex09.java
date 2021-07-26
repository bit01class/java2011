package kr.co.joy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex09 {

	public static void main(String[] args) {
		File file=new File("ex05.bin");
		OutputStream os=null;
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		try {
			os=new FileOutputStream(file);
			osw=new OutputStreamWriter(os);
			bw=new BufferedWriter(osw);
			
			bw.write("첫번째");
			bw.newLine();
			bw.write("두번째");
			bw.newLine();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(bw!=null){bw.close();}
				if(osw!=null){osw.close();}
				if(os!=null){os.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}







