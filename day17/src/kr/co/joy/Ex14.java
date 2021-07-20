package kr.co.joy;

import java.util.*;

public class Ex14 implements Comparable{
	int su;
	
	public Ex14(int su) {
		this.su=su;
	}

	public static void main(String[] args) {
		Set set1=new TreeSet();
//		set1.add("첫번째");
//		set1.add("두번째");
//		set1.add("세번째");
//		set1.add("네번째");
//		set1.add("두번째");
		set1.add(new Ex14(1));
		set1.add(new Ex14(2));
		set1.add(new Ex14(1));
		set1.add(new Ex14(3));
		
		Iterator ite=set1.iterator();
		while(ite.hasNext()){
			Object obj=ite.next();
			System.out.println(obj);
		}

	}

	@Override
	public int compareTo(Object o) {
		Ex14 obj=(Ex14) o;
		return su-obj.su;
	}

}
