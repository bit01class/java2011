package kr.co.joy;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {
		// Map타입
		// put(key, val);
		// get(key);
		// key- 중복(수정), null(중복시수정)
		// val- 중복가능, null(중복가능)
		java.util.Map map1=new java.util.HashMap();
		map1.put(1, 1111);
		map1.put(2.0, 3.14);
		map1.put(true, "문자열");
		map1.put("네번째", "문자열");
		map1.put(true, "바꿈");
		map1.put('A', null);
		map1.put(null, null);
		map1.put(null, "널아님");
		
		
		Set entrys = map1.entrySet();
		Iterator ite2 = entrys.iterator();
		while(ite2.hasNext()){
			java.util.Map.Entry entry=(Entry) ite2.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
//		java.util.Set keys=map1.keySet();
//		java.util.Iterator ite=keys.iterator();
//		while(ite.hasNext()){
//			Object key=ite.next();
//			System.out.println(key+" : "+map1.get(key));
//		}
		
//		System.out.println(map1.get(1));
//		System.out.println(map1.get(2.0));
//		System.out.println(map1.get(true));
//		System.out.println(map1.get("네번째"));
//		System.out.println(map1.get('A'));
//		System.out.println(map1.get(null));
//		System.out.println(map1.get("첫번째"));
	}

}
