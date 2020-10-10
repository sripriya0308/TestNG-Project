package org.base.test;

import java.util.ArrayList;
import java.util.List;

public class TestTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<ArrayList<String>>  li=new ArrayList();
		
		
		ArrayList<String> l1=new ArrayList();
		l1.add("Mary");
		l1.add("mary@gmail.com");
		l1.add("java");
		
		ArrayList<String> l2=new ArrayList();
		l2.add("Rose");
		l2.add("rose@gmail.com");
		l2.add("python");
		
		
		ArrayList<String> l3=new ArrayList();
		l3.add("john");
		l3.add("john@gmail.com");
		l3.add("selenium");
		
		
		ArrayList<String> l4=new ArrayList();
		l4.add("steve");
		l4.add("steve@gmail.com");
		l4.add("appium");
		
		li.add(l1);
		li.add(l2);
		li.add(l3);
		li.add(l4);
		
		
		
		ArrayList<String>  al=li.get(3);
		String course=al.get(2);
		System.out.println(course);
		
		
		
		
	}

}
