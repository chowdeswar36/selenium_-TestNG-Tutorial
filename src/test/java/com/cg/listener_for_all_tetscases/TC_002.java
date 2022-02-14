package com.cg.listener_for_all_tetscases;

import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TC_002 {
	@Test
	public void login2Pass() {
		System.out.println("this is login2Pass");
		Assert.assertTrue(true);
	}

	@Test
	public void login2Fail() {
		System.out.println("this is login2Fail");
		Assert.assertTrue(false);
	}

	@Test
	public void login2Skip() {
		System.out.println("this is login2Skip");
		throw new SkipException("this is skip method");
	}

}
