package org.testing.apitesting.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.apitesting.Utilities.HandleJSONInput;
import org.testing.apitesting.Utilities.HandleProperties;
import org.testing.apitesting.Utilities.UpdateJSONDynamicVariable;
import org.testing.apitesting.testSteps.HTTPMethods;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TestCase4_GetParticularStudent {

	public Properties pr;
	
	@Test
	public void testCase4_getaStudent() throws IOException {
		pr=HandleProperties.loadProperties();
		HTTPMethods method = new HTTPMethods(pr);
		method.getParticularDetail("STUDENTLIST_URI", HTTPMethods.returnId);
		//System.out.println(res.jsonPath().get("id"));
		
		
	}
	
}
