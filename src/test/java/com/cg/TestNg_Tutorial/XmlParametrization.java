package com.cg.TestNg_Tutorial;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XmlParametrization {

	// for xml parameterization we must require .xml file and run that xml file only
	@Test()
	@Parameters({ "name", "surname" })
	public void getData(String name, String surname) {
		System.out.println(name + "----" + surname);
	}
}
