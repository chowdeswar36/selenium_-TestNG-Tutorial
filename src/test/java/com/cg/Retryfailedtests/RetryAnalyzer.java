package com.cg.Retryfailedtests;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	int count = 1;
	int retrylimit = 3;

	@Override
	public boolean retry(ITestResult result){
		if (count <= retrylimit) {
			System.out.println("This is "+count+" time exceution of failed test case");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count++;
			return true;
		}
		return false;
	}

}
