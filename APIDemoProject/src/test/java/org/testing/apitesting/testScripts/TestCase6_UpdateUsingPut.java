package org.testing.apitesting.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.apitesting.Utilities.HandleJSONInput;
import org.testing.apitesting.Utilities.HandleProperties;
import org.testing.apitesting.Utilities.UpdateJSONDynamicVariable;
import org.testing.apitesting.testSteps.HTTPMethods;
import org.testng.annotations.Test;

public class TestCase6_UpdateUsingPut {
	
	public Properties pr;
	
	@Test
	public void testCase6_updateallDetails() throws IOException {
		pr=HandleProperties.loadProperties();
		String bodyData = HandleJSONInput.loadJSON("../APIDemoProject/src/test/java/org/testing/apitesting/resources/inputJSONforUpdateStd.json");
		bodyData =UpdateJSONDynamicVariable.replaceData(bodyData, "id", HTTPMethods.returnId);
		HTTPMethods method = new HTTPMethods(pr);
		method.updateallStudentDetail(bodyData, HTTPMethods.returnId, "STUDENTLIST_URI");
		
	}

}
