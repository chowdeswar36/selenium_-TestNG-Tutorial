package com.seleniumGrid_Parallel;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Grid_parallel_2 {

	@Test
	public void test1() throws MalformedURLException {
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.WINDOWS);

		URL url = new URL("http://192.168.10.35:4444/wd/hub");

		WebDriver driver = new RemoteWebDriver(url, capability);
		driver.get("https://www.youtube.com/");
		System.out.println("Chrome 2 " + driver.getTitle());
		driver.close();

	}
}
