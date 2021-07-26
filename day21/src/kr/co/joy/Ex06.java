package kr.co.joy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class Ex06 {

	public static void main(String[] args) {
		File file=new File("ex03.bin");
		
		InputStream is=null;
		ObjectInputStream ois=null;
		try {
			is=new FileInputStream(file);
			ois=new ObjectInputStream(is);
			
			System.out.println(ois.readObject());
			
			int su1=ois.read();
			byte su2=ois.readByte();
			int su3=ois.readInt();
			double su4=ois.readDouble();
			boolean boo=ois.readBoolean();
			char su5=ois.readChar();
			String msg=ois.readUTF();
			
			Vector vec=(Vector) ois.readObject();
			
			int[] arr=(int[]) ois.readObject();
			System.out.println(Arrays.toString(arr));
			
			ArrayList list=(ArrayList) vec.get(0);
			Set set=(Set) vec.get(1);
			Map<String,String> map=(Map<String, String>) vec.get(2);
			
//			ArrayList list=(ArrayList) ois.readObject();
//			Set set=(Set) ois.readObject();
//			Map<String,String> map=(Map<String, String>) ois.readObject();
			
			System.out.println(su1);
			System.out.println(su2);
			System.out.println(su3);
			System.out.println(su4);
			System.out.println(boo);
			System.out.println(su5);
			System.out.println(msg);
			
			System.out.println("-------------------------------------");
			for(int i=0; i<list.size(); i++){
				System.out.println(list.get(i));
			}
			System.out.println("-------------------------------------");
			Iterator ite=set.iterator();
			while(ite.hasNext()){
				System.out.println(ite.next());
			}
			System.out.println("-------------------------------------");
			Set<String> keys=map.keySet();
			Iterator<String> ite2=keys.iterator();
			while(ite2.hasNext()){
				String key=ite2.next();
				System.out.println(key+":"+map.get(key));
			}
			
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








