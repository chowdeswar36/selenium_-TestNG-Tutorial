package com.alltestngtags;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + "Test case started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + "Test case passed");

	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + "Test case failed");

	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName() + "Test case Skipped");

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

	public void onStart(ITestContext context) {
		System.out.println(context.getName() + "onStart");
	}

	public void onFinish(ITestContext context) {
		System.out.println(context.getName() + "onFinish");
		System.out.println("-----------------------------------------------------------");
	}
}
