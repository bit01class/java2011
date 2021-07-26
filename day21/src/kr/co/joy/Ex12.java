package kr.co.joy;

import java.util.*;
import java.io.*;

public class Ex12 {

	public static void main(String[] args) throws IOException {
		File file=new File("ex12.bin");
		System.out.println("�л������������α׷�(ver 0.8.1)");
		Scanner sc=new Scanner(System.in);
		int input=-1;
		while(true){
			System.out.print("1.���� 2.�Է� 0.����>>");
			input=sc.nextInt();
			if(input==0){break;}
			if(input==1){
				System.out.println("----------------------------------------------");
				System.out.println("����\t����\t����");
				System.out.println("----------------------------------------------");
				InputStream is=null;
				ObjectInputStream ois=null;
				try{
					is=new FileInputStream(file);
					ois=new ObjectInputStream(is);
					
					while(true){
						Map<String,Integer> stu = (Map<String, Integer>) ois.readObject();
						System.out.println(stu.get("kor")+"\t"
								+stu.get("eng")+"\t"+stu.get("math"));
					}
					
				}catch(Exception e){
				}finally{
					if(ois!=null){ois.close();}
					if(is!=null){is.close();}
				}
			}
			if(input==2){
				Map<String,Integer> stu=new HashMap<>();
				System.out.print("����>");
				stu.put("kor", sc.nextInt());
				System.out.print("����>");
				stu.put("eng", sc.nextInt());
				System.out.print("����>");
				stu.put("math", sc.nextInt());
				OutputStream os=null;
				ObjectOutputStream oos=null;
				InputStream is=null;
				ObjectInputStream ois=null;
				ArrayList list=new ArrayList();
				try {
					is=new FileInputStream(file);
					ois=new ObjectInputStream(is);
					try{
						while(true){
							list.add(ois.readObject());
						}
					}catch(Exception e){}
					
					os=new FileOutputStream(file);
					oos=new ObjectOutputStream(os);
					for(int i=0; i<list.size(); i++){
						oos.writeObject(list.get(i));
					}
					oos.writeObject(stu);
					oos.flush();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} finally{
					if(oos!=null){oos.close();}
					if(os!=null){os.close();}
				}
			}
		}
	}

}










