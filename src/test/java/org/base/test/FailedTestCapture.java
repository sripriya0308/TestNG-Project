package org.base.test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailedTestCapture implements IRetryAnalyzer {
	
	int minCount=0;  int maxCount=10;

	public boolean retry(ITestResult arg0) {
		
		if(minCount<maxCount) {
			
			minCount++;
			return true;
		}
	
		
		return false;
	}

}
