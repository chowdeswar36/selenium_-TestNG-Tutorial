package com.cg.TestNg_Tutorial;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//hard assertion:if a hard assertion fails then immediately test case marked as fail and it will be terminated
//soft assertion:if a soft assertion fails then immediately test case not marked as fail and it will be executed until completed
//AssertAll():if we want to mark any test case as fail whenever assertion fails then use softassert.AssertAll() at every test end;

public class Hard_Soft_Assertions {

	SoftAssert soft = new SoftAssert();;

	@BeforeMethod
	public void test() {
		System.out.println("opens browser");
		Assert.assertEquals(true, true);// it is a hard assertion
		System.out.println("enters username");
		System.out.println("enters password");
		System.out.println("click login");
		System.out.println("verify home page title ");
		Assert.assertEquals(true, true);// it is a hard assertion
	}

	@Test
	public void add() {
		System.out.println("add employee and click add");
		// Assert.assertEquals(true, false);//it is a hard assertion(it is not
		// recommended here because it stops the next test cases)
		soft.assertEquals(true, false, "Add employee test case failed");
		soft.assertAll();
	}

	@Test
	public void search() {
		System.out.println("search employee and click search");
		// Assert.assertEquals(true, false);//it is a hard assertion(it is not
		// recommended here because it stops the next test cases)
		soft.assertEquals(true, false);
		soft.assertAll();
	}

	@Test
	public void delete() {
		System.out.println("delete employee and click delete");
		// Assert.assertEquals(true, false);//it is a hard assertion(it is not
		// recommended here because it stops the next test cases)
		soft.assertEquals(true, false);
		soft.assertAll();
	}

	@Test
	public void update() {
		System.out.println("update employee and click update");
		// Assert.assertEquals(true, false);//it is a hard assertion(it is not
		// recommended here because it stops the next test cases)
		soft.assertEquals(true, false);
		soft.assertAll();
	}
}
