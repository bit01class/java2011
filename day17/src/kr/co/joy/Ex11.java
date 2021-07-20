package kr.co.joy;

import java.util.Enumeration;
import java.util.Vector;

public class Ex11 {

	public static void main(String[] args) {
		// vector
		java.util.Vector vec1=new Vector();
		vec1.addElement("첫번째");
		vec1.addElement("두번째");
		vec1.addElement("세번째");
		vec1.addElement("네번째");
		
		System.out.println(vec1.elementAt(0));
		System.out.println(vec1.elementAt(1));
		System.out.println(vec1.elementAt(2));
		System.out.println(vec1.elementAt(3));
		System.out.println("------------------------");
//		System.out.println(vec1.firstElement());
//		vec1.removeElementAt(0);
//		System.out.println(vec1.firstElement());
//		vec1.removeElementAt(0);
//		System.out.println(vec1.firstElement());
//		vec1.removeElementAt(0);
//		System.out.println(vec1.firstElement());
//		vec1.removeElementAt(0);
		System.out.println("------------------------");
		java.util.Enumeration em = vec1.elements();
		System.out.println(em.hasMoreElements());
		System.out.println(em.nextElement());
		System.out.println(em.hasMoreElements());
		System.out.println(em.nextElement());
		System.out.println(em.hasMoreElements());
		System.out.println(em.nextElement());
		System.out.println(em.hasMoreElements());
		System.out.println(em.nextElement());
		System.out.println(em.hasMoreElements());
		System.out.println(em.hasMoreElements());
		System.out.println(em.hasMoreElements());
	}

}










