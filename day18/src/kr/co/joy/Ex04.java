package kr.co.joy;

import java.util.*;

public class Ex04 {

	public static void main(String[] args) {
		Map map1=new TreeMap();
		System.out.println(map1.isEmpty());
		map1.put("처음", 1111);
		map1.put("다음", 2222);
		map1.put("또다음", 3333);
		System.out.println(map1.isEmpty());
		Map map2=new HashMap();
		map2.putAll(map1);
		map2.remove("다음");
		map2.remove("또다음", 4444);
		map2.replace("또다음", 4444);
		map2.clear();
		Collection col = map1.values();
		Iterator ite=col.iterator();
		System.out.println(map2.size());
		System.out.println(map2.get("또다음"));
		
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		System.out.println("------------------------------");
		Set keys=map1.keySet();
		ite=keys.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}

}






