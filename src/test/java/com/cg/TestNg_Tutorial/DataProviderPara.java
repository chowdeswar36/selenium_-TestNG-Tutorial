package com.cg.TestNg_Tutorial;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPara {

	@Test(dataProvider = "data", groups = "A")
	public void getOne(String name) {
		System.out.println(name);
	}

	@Test(dataProvider = "data", groups = "B")
	public void getBoth(String name, String surname) {
		System.out.println(name + "----" + surname);
	}

	//// by checking method name
//	@DataProvider(name = "data")
//	public Object[][] getData(Method m) {
//		String dataOne[][] = { { "radha" }, { "dharma" }, { "deekshitha" } };
//		String dataBoth[][] = { { "radha", "vankam" }, { "dharma", "chowdam" }, { "deekshitha", "chowdam" } };
//		String[][] dataObject = null;
//		if (m.getName().equalsIgnoreCase("getOne")) {
//			dataObject = dataOne;
//		} else if (m.getName().equalsIgnoreCase("getBoth")) {
//			dataObject = dataBoth;
//		}
//		return dataObject;
//	}

	/// by checking the which group
	@DataProvider(name = "data")
	public Object[][] getData(ITestContext g) {
		String dataOne[][] = { { "radha" }, { "dharma" }, { "deekshitha" } };
		String dataBoth[][] = { { "radha", "vankam" }, { "dharma", "chowdam" }, { "deekshitha", "chowdam" } };
		String[][] dataObject = {{}};
		for (String i : g.getIncludedGroups()) {
			if (i.equalsIgnoreCase("A")) {
				dataObject = dataOne;
				System.out.println(dataObject);
				break;
			} else if (i.equalsIgnoreCase("getBoth")) {
				dataObject = dataBoth;
				break;
			}
		}
		return dataObject;
	}

//	@Test
//	public void properties() throws IOException {
//		Properties properties = new Properties();
//		FileInputStream file = new FileInputStream(
//				"C:\\Users\\chowd\\eclipse-workspace\\TestNgTutorial\\src\\config.properties");
//		properties.load(file);
//		System.out.println(properties.getProperty("name"));
//		System.out.println(properties.getProperty("surname"));
//
//	}
}
