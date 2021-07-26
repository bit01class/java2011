package kr.co.joy;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex11 {

	public static void main(String[] args) {
		File file=new File("ex11.bin");
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		OutputStream os=null;
		java.io.DataOutputStream dos=null;
		try {
			os=new FileOutputStream(file);
			dos=new DataOutputStream(os);
			
			dos.write(127);
			byte su1=-128;
			dos.writeByte(su1);
			int su2=1234;
			dos.writeInt(su2);
			char ch='@';
			dos.writeChar(ch);
			boolean boo=true;
			dos.writeBoolean(boo);
			double su3=3.14;
			dos.writeDouble(su3);
			float su4=3.14F;
			dos.writeFloat(su4);
			String msg="java io";
			dos.writeUTF(msg);
			System.out.println("작성완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(dos!=null){dos.close();}
				if(os!=null){os.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
