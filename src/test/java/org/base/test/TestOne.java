package org.base.test;

import java.util.ArrayList;
import java.util.List;

public class TestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> li=new ArrayList();
		
		li.add("Mary");
		li.add("Mary@gmail.com");
		li.add("Java");
		
		
		String emailId=li.get(1);
		
		System.out.println(emailId);
		
		
		

	}

}
