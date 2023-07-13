package org.testing.apitesting.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.apitesting.Utilities.HandleProperties;
import org.testing.apitesting.testSteps.HTTPMethods;
import org.testng.annotations.Test;

public class TestCase5_UpdateStudentName {
	
public Properties pr;
	
	@Test
	public void testCase5_updateStudentName() throws IOException {
		pr=HandleProperties.loadProperties();
		HTTPMethods method = new HTTPMethods(pr);
		method.updateDetails("STUDENTLIST_URI", HTTPMethods.returnId);
		//System.out.println(res.jsonPath().get("id"));
		
		
	}

}
