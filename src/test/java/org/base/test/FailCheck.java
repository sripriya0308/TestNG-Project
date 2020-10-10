package org.base.test;

import org.testng.annotations.Test;

public class FailCheck {
	
	
	
	@Test(retryAnalyzer=FailedTestCapture.class)
	public void testA() {
		
		
		int a=0;
		int b=10;
		
		System.out.println(b/a);
	}

}
