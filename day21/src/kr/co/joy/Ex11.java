package kr.co.joy;

import java.util.*;
import java.io.*;

public class Ex11 {

	public static void main(String[] args) {
		List<Map<String,Integer>> list=new ArrayList<>();
		File file=new File("ex11.bin");
		
		if(!file.exists()){
			OutputStream os=null;
			ObjectOutputStream oos=null;
			try {
				file.createNewFile();
				os=new FileOutputStream(file);
				oos=new ObjectOutputStream(os);
				oos.writeObject(list);
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
		
		Scanner sc=new Scanner(System.in);
		System.out.println("�л������������α׷�(ver 0.9.0)");
		int input=-1;
		while(true){
			System.out.print("1.���� 2.�Է� 0.����>");
			input=sc.nextInt();
			if(input==0){break;}
			if(input==1){
				InputStream is=null;
				ObjectInputStream ois=null;
				try {
					is=new FileInputStream(file);
					ois=new ObjectInputStream(is);
					
					list=(List<Map<String, Integer>>) ois.readObject();
					
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
				System.out.println("----------------------------------------------");
				System.out.println("����\t����\t����");
				System.out.println("----------------------------------------------");
				for(int i=0; i<list.size(); i++){
					Map<String, Integer> stu = list.get(i);
					System.out.println(stu.get("kor")+"\t"
							+stu.get("eng")+"\t"+stu.get("math"));
				}
			}
			if(input==2){
				InputStream is=null;
				ObjectInputStream ois=null;
				try {
					is=new FileInputStream(file);
					ois=new ObjectInputStream(is);
					
					list=(List<Map<String, Integer>>) ois.readObject();
					
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
				
				Map<String,Integer> stu=new HashMap<>();
				System.out.print("����>");
				stu.put("kor", sc.nextInt());
				System.out.print("����>");
				stu.put("eng", sc.nextInt());
				System.out.print("����>");
				stu.put("math", sc.nextInt());
				list.add(stu);
				OutputStream os=null;
				ObjectOutputStream oos=null;
				try {
					os=new FileOutputStream(file);
					oos=new ObjectOutputStream(os);
					oos.writeObject(list);
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
	}

}
