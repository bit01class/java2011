package kr.co.joy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Ex08 {

	public static void main(String[] args) {
		// Print stream
		// output
		PrintStream outt=System.out;
		File file=new File("test01\\ex03.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		OutputStream os=null;
		PrintStream ps=null;
		try {
			os=new FileOutputStream(file);
			ps=new PrintStream(os);
			
			ps.print("累己1");
			ps.print("累己2");
			ps.println("累己饶 俺青");
			ps.println();
			ps.println("场");
			outt.println("累己场");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps!=null){ps.close();}
				if(os!=null){os.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}





