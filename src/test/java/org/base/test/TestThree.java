package org.base.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Map<String,String> mp=new LinkedHashMap();
		mp.put("name", "Mary");
		mp.put("email id", "mary@gmail.com");
		mp.put("course", "java");
		
		String emailId=mp.get("email id");
		System.out.println(emailId);
		
		
		
		
		
		

	}

}
