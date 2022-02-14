package com.cg.scrshotforFailedTests;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class BaseCls {
	public static WebDriver driver;

	public static void getScreenshot(String methodName) {
		TakesScreenshot scrshot = (TakesScreenshot) driver;
		File src = scrshot.getScreenshotAs(OutputType.FILE);
		File target = new File(".//Screenshots//" + methodName + ".png");
		try {
			FileHandler.copy(src, target);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
