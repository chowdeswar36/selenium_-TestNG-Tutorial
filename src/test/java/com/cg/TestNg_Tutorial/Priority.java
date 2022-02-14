package com.cg.TestNg_Tutorial;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority = 2) // Second Highest Priority
	public void a_test() {
		System.out.println("iam in a");
	}

	@Test(priority = 3) // Lowest Priority
	public void b_test() {
		System.out.println("iam in b");
	}

	@Test(priority = 1) // Highest Priority
	public void c_test() {
		System.out.println("iam in c");
	}

	/// by default priority is 0
	@Test()
	public void d_test() {
		System.out.println("iam in d");
	}

	// if we test cases are having same priority
	@Test(priority = 4) 
	public void e_test() {
		System.out.println("iam in e");
	}

	@Test(priority = 4)
	public void f_test() {
		System.out.println("iam in f");
	}

	// we can also give negative numbers
	@Test(priority = -1)
	public void g_test() {
		System.out.println("iam in g");
	}

	@Test(priority = -2)
	public void h_test() {
		System.out.println("iam in h");
	}
}
