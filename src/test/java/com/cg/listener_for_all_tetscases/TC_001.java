package com.cg.listener_for_all_tetscases;

import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

//if we want to listener for only one class then you can use this 
//@Listeners(com.cg.listener_for_all_tetscases.MyListener.class)
public class TC_001 {
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

}
