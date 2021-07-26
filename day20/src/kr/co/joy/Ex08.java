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
			
			ps.print("�ۼ�1");
			ps.print("�ۼ�2");
			ps.println("�ۼ��� ����");
			ps.println();
			ps.println("��");
			outt.println("�ۼ���");
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





