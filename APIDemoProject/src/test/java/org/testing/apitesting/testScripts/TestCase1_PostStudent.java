package org.testing.apitesting.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.apitesting.Utilities.HandleJSONInput;
import org.testing.apitesting.Utilities.HandleProperties;
import org.testing.apitesting.Utilities.UpdateJSONDynamicVariable;
import org.testing.apitesting.testSteps.HTTPMethods;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TestCase1_PostStudent extends HandleProperties {
	
	public Properties pr;
		
	@Test
	public void testCase1_Student() throws IOException {
		pr=HandleProperties.loadProperties();
		String bdata = HandleJSONInput.loadJSON("../APIDemoProject/src/test/java/org/testing/apitesting/resources/inputJSONforStudent.json");
		String idValue = UpdateJSONDynamicVariable.generateRandomId();
		bdata=UpdateJSONDynamicVariable.replaceData(bdata,"id",idValue);
		HTTPMethods method = new HTTPMethods(pr);
		Response res = method.postRequest(bdata, "STUDENTLIST_URI");
		//System.out.println(res.jsonPath().get("id"));
		
		
	}

}
