package kr.co.joy;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex07 {

	public static void main(String[] args) {
		// listÅ¸ÀÔ - LinkedList
		java.util.List list1=new LinkedList();
		list1.add(1111);
		list1.add(2222);
		list1.add(3333);
		list1.add(4444);
		java.util.List list2=new ArrayList(list1);
		list2.addAll(list1);
		for(int i=0; i<list2.size(); i++){
			System.out.println(list2.get(i));
		}
	}

}
