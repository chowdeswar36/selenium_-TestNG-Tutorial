package com.cg.scrshotforFailedTests;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

	public void onTestFailure(ITestResult result) {
		BaseCls.getScreenshot(result.getName() + "-" + java.time.LocalDate.now().toString());
		BaseCls.driver.close();
	}

}
