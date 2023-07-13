package org.testing.apitesting.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.apitesting.Utilities.HandleProperties;
import org.testing.apitesting.testSteps.HTTPMethods;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class TestCase3_GetAllStudents extends HandleProperties {
	
	public Properties pr;
	
	@Test
	public void getAllStudents() throws IOException {
		pr=HandleProperties.loadProperties();
		HTTPMethods htget = new HTTPMethods(pr);
		htget.getAll("STUDENTLIST_URI");
		
	}

}
