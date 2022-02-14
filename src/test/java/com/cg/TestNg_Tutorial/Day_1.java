package com.cg.TestNg_Tutorial;

import org.testng.annotations.Test;

public class Day_1 {
	@Test()
	public void personalLoanweblogin() {
		System.out.println("personalLoanweblogin");
	}

	@Test
	public void personalLoanwebdashboard() {
		System.out.println("personalLoanwebdashboard");
	}

	@Test(groups = { "Smoke" })
	public void personalLoanwebcustomerdetails() {
		System.out.println("personalLoanwebcustomerdetails");
	}

	@Test
	public void personalLoanwebservice() {
		System.out.println("personalLoanwebservice");
	}
}
