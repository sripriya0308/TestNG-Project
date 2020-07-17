package org.base.test;

import org.testng.annotations.Test;

public class TestD {
	
	@Test(groups="regression")
	public void testE() {
		
		System.out.println("E");
		System.out.println("E"+Thread.currentThread().getId());
	}
	@Test(groups="smoke")
	public void testF() {
		System.out.println("F"+Thread.currentThread().getId());
		
		System.out.println("F");
	}

}
