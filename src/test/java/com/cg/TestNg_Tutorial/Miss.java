package com.cg.TestNg_Tutorial;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Miss {
	@Test
	public void a() {
		System.out.println("This is a");
	}

	@Test(enabled = false)
	public void b() {
		System.out.println("This is b");
	}

	@Ignore
	@Test
	public void c() {
		System.out.println("This is c");
	}

	@Test
	public void d() {
		System.out.println("This is d");
	}

	@Test
	public void e() {
		System.out.println("This is e");
	}
}
