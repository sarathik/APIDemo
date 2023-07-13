package org.testing.apitesting.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.apitesting.Utilities.HandleJSONInput;
import org.testing.apitesting.Utilities.HandleProperties;
import org.testing.apitesting.testSteps.HTTPMethods;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase2_PostTeacher extends HandleProperties {
	
	public Properties pr;
	
	@Test
	public void postTeacher() throws IOException {
		pr=HandleProperties.loadProperties();
		String uri=pr.getProperty("STUDENTLIST_URI");
		String bodyJsonTeacher = HandleJSONInput.loadJSON("../APIDemoProject/src/test/java/org/testing/apitesting/resources/inputJSONforTeacher.json");
		HTTPMethods postTeacher = new HTTPMethods(pr);
		postTeacher.postRequest(bodyJsonTeacher, "TEACHERLIST_URI");
		
		
		
	}

}
