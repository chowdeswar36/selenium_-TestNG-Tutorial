package com.cg.scrshotforFailedTests;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Srcshot_without_xml_listener_class {
	WebDriver driver;

	@Test
	public void verifyGoogle() {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Assert.assertEquals(driver.getTitle(), "gogle", "Title doesnot matched");
	}

	@AfterMethod
	public void getScrshot(ITestResult result) throws IOException {
		if (!result.isSuccess()) {
			TakesScreenshot scrshot = (TakesScreenshot) driver;
			File src = scrshot.getScreenshotAs(OutputType.FILE);
			File target = new File(".//Screenshots//" + result.getName() + ".png");
			FileHandler.copy(src, target);
			driver.close();
		}
	}
}
