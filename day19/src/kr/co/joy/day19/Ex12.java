package kr.co.joy.day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print(">>");
		String msg=sc.nextLine();
		byte[] bys=msg.getBytes();
		File file=new File("test08.txt");
		FileOutputStream os=null;
		try {
			os=new FileOutputStream(file);
			for(int i=0; i<bys.length; i++){
				os.write(bys[i]);
			}
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
