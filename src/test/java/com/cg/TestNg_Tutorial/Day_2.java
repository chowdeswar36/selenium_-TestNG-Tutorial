package com.cg.TestNg_Tutorial;

import org.testng.annotations.Test;

public class Day_2 {
	@Test
	public void personalLoanMobilelogin() {
		System.out.println("personalLoanMobilelogin");
	}

	@Test
	public void personalLoanMobiledashboard() {
		System.out.println("personalLoanMobiledashboard");
	}

	@Test(groups = { "Smoke" }, dependsOnGroups = { "Regression" }, dependsOnMethods = {
			"personalLoanMobiledashboard", })
	public void personalLoanMobileCustomerdetails() {
		System.out.println("personalLoanMobileCustomerdetails");
	}

	@Test(groups = "Regression")
	public void personalLoanMobileservicen() {
		System.out.println("personalLoanMobileservicen");
	}

}
