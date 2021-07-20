package kr.co.joy;

import java.util.ArrayList;

public class Ex04 {

	public static void main(String[] args) {
		// list타입-선형구조(순서o, 중복가능)
		ArrayList list1=new ArrayList();
		list1.add(1111);
		list1.add(2222);
		list1.add(3333);
		list1.add(4444);
		System.out.println(list1.size());
		ArrayList list2=new ArrayList(5);
		System.out.println(list2.size());
		ArrayList list3=new ArrayList(list1);
//		list3.clear();
		System.out.println(list3.size());
		System.out.println(list1==list3);
		ArrayList list4=(ArrayList)list1.clone();
		System.out.println(list4.size());
		System.out.println(list2.isEmpty());
		System.out.println(list4.isEmpty());
		list1.set(1,2000);
		for(int i=0; i<list1.size(); i++){
			System.out.println(list1.get(i));
		}
	}

}









