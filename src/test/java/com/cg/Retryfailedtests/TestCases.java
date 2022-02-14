package com.cg.Retryfailedtests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases {

	@Test
	public void testA() {
		System.out.println("Sucess!!!!!!!!");
	}

	@Test
	public void testB() {
		Assert.assertEquals(true, false,"test case B failed");
	}

}
