package kr.co.joy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class Ex05 implements java.io.Serializable{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		// Object Stream
		File file=new File("ex03.bin");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		OutputStream os=null;
		ObjectOutputStream oos=null;
		try {
			os=new FileOutputStream(file);
			oos=new ObjectOutputStream(os);
			
			Ex05 me=new Ex05();
			oos.writeObject(me);
			
			oos.write(127);
			oos.writeByte(-128);
			oos.writeInt(1234);
			oos.writeDouble(3.14);
			oos.writeBoolean(true);
			oos.writeChar('@');
			oos.writeUTF("문자열");
			ArrayList list=new ArrayList();
			list.add(1111);
			list.add(3.14);
			list.add('#');
			list.add("문자열2");
//			oos.writeObject(list);
			oos.flush();
			
			Set set=new HashSet();
			set.add(1111);
			set.add(2222);
			set.add(3333);
			set.add(1111);
//			oos.writeObject(set);
			
			Map<String,String> map=new HashMap<>();
			map.put("key1", "val1");
			map.put("key2", "val2");
			map.put("key3", "val3");
//			oos.writeObject(map);
			
			Vector vec=new Vector();
			vec.add(list);
			vec.add(set);
			vec.add(map);
			oos.writeObject(vec);
			
			int[] arr=new int[]{1,3,5,7};
			oos.writeObject(arr);
			
			System.out.println("작성완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
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









