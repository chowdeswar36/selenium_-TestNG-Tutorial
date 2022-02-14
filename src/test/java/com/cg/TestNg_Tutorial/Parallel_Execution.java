package com.cg.TestNg_Tutorial;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parallel_Execution {

	@Test(dataProvider = "data")
	public void getOne(String name) {
		System.out.println(name + " " + Thread.currentThread().getId());
	}

	// if we want to run dataprovider in parallel use data-provider-thread-count="3"
	@DataProvider(name = "data",parallel = true)
	public Object[][] getData() {
		String dataOne[][] = { { "deekshitha" }, { "vani" }, { "prasad" }, { "radha" }, { "dharma" },
				{ "deekshitha" } };
		return dataOne;
	}

	@Test()
	public void a() throws InterruptedException {
		System.out.println("a " + Thread.currentThread().getId());
		Thread.sleep(2000);
	}

	@Test()
	public void b() throws InterruptedException {
		System.out.println("b " + Thread.currentThread().getId());
		Thread.sleep(2000);
	}

	@Test()
	public void c() throws InterruptedException {
		System.out.println("c " + Thread.currentThread().getId());
		Thread.sleep(2000);
	}

	@Test()
	public void d() throws InterruptedException {
		System.out.println("d " + Thread.currentThread().getId());
		Thread.sleep(2000);
	}
}
