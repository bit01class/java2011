package kr.co.joy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

// 직렬화
class Node implements java.io.Serializable{
	
//	private static final long serialVersionUID = 1234L;
	
	public static int su1=1112;
	public transient int su2=2222;	// 직렬화의 대상에서 제외
	protected int su3=3333;
	int su4=4444;
	private int su5=5555;
	
	public static void func01(){
		System.out.println("static method");
	}
	public void func02(){
		System.out.println("non-static method"+su5);
	}
	public void func03(){
		System.out.println(su5);
		System.out.println(su5);
	}
	public void func04(){
		System.out.println(su5);
		System.out.println(su5);
	}
}

public class Ex07 {

	public static void main(String[] args) {
		File file=new File("ex04.bin");
		OutputStream os=null;
		ObjectOutputStream oos=null;
		try {
			file.createNewFile();
			os=new FileOutputStream(file);
			oos=new ObjectOutputStream(os);
			
			Node node=new Node();
			oos.writeObject(node);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(oos!=null){oos.close();}
				if(os!=null){os.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
