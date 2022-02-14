package com.cg.scrshotforFailedTests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases extends BaseCls {

	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Assert.assertEquals(driver.getTitle(), "gogle", "Title doesnot matched");
	}
}
