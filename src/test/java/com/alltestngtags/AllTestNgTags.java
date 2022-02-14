package com.alltestngtags;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/*@BeforeSuite,
  @BeforeTest,
  @BeforeClass,
  @BeforeMethod,
  @Test,
  @AfterMethod,
  @AfterClass,
  @AfterTest,
  @AfterSuite*/

//By default @test methods are executed based on method name(alphabetic order) if we want order then we go for priority concept
@Listeners(com.alltestngtags.MyListener.class)
public class AllTestNgTags {

	@Test
	public void login1Pass() {
		System.out.println("this is login1Pass");
		Assert.assertTrue(true);
	}

	@Test
	public void login1Fail() {
		System.out.println("this is login1Fail");
		Assert.assertTrue(false);
	}

	@Test
	public void login1Skip() {
		System.out.println("this is login1Skip");
		throw new SkipException("this is skip method");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This will execute before every Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This will execute after every Method");
		System.out.println("**********************************************");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("This will execute before the Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("This will execute after the Class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This will execute before the Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("This will execute after the Test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This will execute before the Test Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("This will execute after the Test Suite");
	}
}
