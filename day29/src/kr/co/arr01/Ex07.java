package kr.co.arr01;

import java.util.ArrayList;

public class Ex07 {

	public static void main(String[] args) {
		// ArrayList

		ArrayList<Integer> list1;
		list1=new ArrayList<>();
		list1.add(1111);
		list1.add(2222);
		list1.add(3333);
		list1.add(4444);
		
		System.out.println(list1.size());
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		System.out.println(list1.get(3));
		System.out.println("----------------------------");
		for(int i=0; i<list1.size(); i++){
			int su=list1.get(i);
			System.out.println(su);
		}
	}

}










