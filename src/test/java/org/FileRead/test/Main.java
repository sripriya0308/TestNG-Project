package org.FileRead.test;

abstract class test{
	
	int x=10;
	
	public void function() {
		
		System.out.println("value a");
	}
	
}
	
	
	class testB extends test{
		
		
		int x=20;
		public void function() {
			
			System.out.println("value of b");
		}
	}
	
	

public class Main {
	
	public static void main(String[] args) {
		
	
	test t=new testB();
	t.function();
	
	}
	

}
