package org.base.test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class TestFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<LinkedHashMap<String,String>>  li=new ArrayList();
		
		
		LinkedHashMap<String,String>  mp1=new LinkedHashMap();
		
		mp1.put("Name", "Mary");
		mp1.put("Email", "mary@gmail.com");
		mp1.put("course", "java");
		
		
       LinkedHashMap<String,String>  mp2=new LinkedHashMap();
		
		mp2.put("Name", "rose");
		mp2.put("Email", "rose@gmail.com");
		mp2.put("course", "selenium");
		
       LinkedHashMap<String,String>  mp3=new LinkedHashMap();
		
		mp3.put("Name", "john");
		mp3.put("Email", "john@gmail.com");
		mp3.put("course", "python");
		
      LinkedHashMap<String,String>  mp4=new LinkedHashMap();
		
		mp4.put("Name", "steve");
		mp4.put("Email", "steve@gmail.com");
		mp4.put("course", "appium");
		
		li.add(mp1);
		li.add(mp2);
		li.add(mp3);
		li.add(mp4);
		
		
		LinkedHashMap<String,String> lm=li.get(2);
		
		String name=lm.get("Name");
		System.out.println(name);
		
		
		
		
		
		
		
		
		
		

	}

}
