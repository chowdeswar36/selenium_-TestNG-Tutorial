package com.cg.TestNg_Tutorial;

import org.testng.annotations.Test;

public class Day_3 {
	@Test
	public void apilogin() {
		System.out.println("apilogin");
	}

	@Test
	public void apidashboard() {
		System.out.println("apidashboard");
	}

	@Test(groups = { "Smoke" })
	public void apicustomerdetails() {
		System.out.println("apicustomerdetails");
	}

	@Test(groups = "Regression")
	public void apiservice() {
		System.out.println("apiservice");
	}
}
