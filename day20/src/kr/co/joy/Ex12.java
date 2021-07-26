package kr.co.joy;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Ex12 {

	public static void main(String[] args) {
		File file=new File("ex11.bin");
		InputStream is=null;
		java.io.DataInputStream dis=null;
		try {
			is=new FileInputStream(file);
			dis=new DataInputStream(is);
			
			int su1=dis.read();
			byte su2=dis.readByte();
			int su3=dis.readInt();
			char su4=dis.readChar();
			boolean boo=dis.readBoolean();
			double su5=dis.readDouble();
			float su6=dis.readFloat();
			String msg=dis.readUTF();
			
			System.out.println(su1);
			System.out.println(su2);
			System.out.println(su3);
			System.out.println(su4);
			System.out.println(boo);
			System.out.println(su5);
			System.out.println(su6);
			System.out.println(msg);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(dis!=null){dis.close();}
				if(is!=null){is.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
