package kr.co.joy;

import java.util.*;

public class Ex12 {

	public static void main(String[] args) {
		List list1=new ArrayList();
		List list2=new LinkedList();
		// ют╥б
		long before1=System.currentTimeMillis();
		for(int i=0; i<100000; i++){
			list1.add(i);
		}
		long after1=System.currentTimeMillis();
		long before2=System.currentTimeMillis();
		for(int i=0; i<100000; i++){
			list2.add(i);
		}
		long after2=System.currentTimeMillis();

		System.out.println("add ArrayList:"+(after1-before1));
		System.out.println("add LinkedList:"+(after2-before2));
		
		long before3=System.currentTimeMillis();
		for(int i=0;i<list1.size(); i++){
			Object obj=list1.get(i);
		}
		long after3=System.currentTimeMillis();
		long before4=System.currentTimeMillis();
		for(int i=0; i<list2.size(); i++){
			Object obj=list2.get(i);
		}
		long after4=System.currentTimeMillis();
		
		System.out.println("get ArrayList:"+(after3-before3));
		System.out.println("get LinkedList:"+(after4-before4));
	}

}










