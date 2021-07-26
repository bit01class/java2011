package kr.co.joy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class Ex03 {

	public static void main(String[] args) {
		File source=new File("ex01.txt");
		File file=new File("ex02.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		char[] cbuf=new char[10];
		Reader fr=null;
		Writer fw=null;
		
		java.io.BufferedReader br=null;
		java.io.BufferedWriter bw=null;
		
		java.io.PrintWriter pw=null;
		try {
			fr=new FileReader(source);
			fw=new FileWriter(file);
			
			br=new BufferedReader(fr);
			bw=new BufferedWriter(fw);
			
			pw=new PrintWriter(bw);
			
			long before=System.currentTimeMillis();
			while(true){
				String msg=br.readLine();
				if(msg==null){break;}
//				bw.write(msg);
//				bw.newLine();	//windows : \r\n, window외 : \n
				pw.println(msg);
			}
			long after=System.currentTimeMillis();
			System.out.println("복사완료 :"+(after-before));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(pw!=null){pw.close();}
				if(bw!=null){bw.close();}
				if(br!=null){br.close();}
				if(fw!=null){fw.close();}
				if(fr!=null){fr.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}











