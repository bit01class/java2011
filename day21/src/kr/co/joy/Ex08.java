package kr.co.joy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Ex08 {

	public static void main(String[] args) {
		File file=new File("ex04.bin");
		InputStream is=null;
		ObjectInputStream ois=null;
		try {
			is=new FileInputStream(file);
			ois=new ObjectInputStream(is);
			
			Node node=(Node) ois.readObject();
			
			System.out.println(Node.su1);
			System.out.println(node.su2);
			System.out.println(node.su3);
			System.out.println(node.su4);
//			System.out.println(node.su5);
			Node.func01();
			node.func02();
			node.func03();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally{
			try {
				if(ois!=null){ois.close();}
				if(is!=null){is.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
