package kr.co.joy.day19;

import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
		// IO (input&output) -file
		String path="D:\\javawork\\.\\..\\javawork\\.\\day19";
		System.out.println(path);
		java.io.File file=new java.io.File(path);
		System.out.println("�����ϳ�?"+file.exists());
		System.out.println("���丮��?"+file.isDirectory());
		System.out.println("�����̳�?"+file.isFile());
		System.out.println("�̸��̸ӳ�?"+file.getName());
		System.out.println("��ΰ��ӳ�1?"+file.getPath());
		System.out.println("�����ΰ��ӳ�2?"+file.getAbsolutePath());
		
		try {
			System.out.println("�����ΰ��ӳ�3?"+file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("������ΰ��ӳ�?"+file.getParent());
		System.out.println("���ϻ������?"+file.length()+"byte");
		System.out.println("�����ѳ�¥?"+new java.util.Date(file.lastModified()));
		System.out.println("�б�"+file.canRead());
		System.out.println("����"+file.canWrite());
		System.out.println("����"+file.canExecute());
		System.out.println("-----------------------------------");
		if(file.isDirectory()){
			java.io.File[] files=file.listFiles();
			for(int i=0; i<files.length; i++){
				System.out.println(files[i].getName());
			}
		}
	}

}






