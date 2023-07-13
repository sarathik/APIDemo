package org.testing.apitesting.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.apitesting.Utilities.HandleProperties;
import org.testing.apitesting.testSteps.HTTPMethods;
import org.testng.annotations.Test;

public class TestCase7_DeleteStudent {
	
		Properties pr;
		
		@Test
		public void deleteStdnt() throws IOException, InterruptedException {
			pr=HandleProperties.loadProperties();
			HTTPMethods method = new HTTPMethods(pr);
			method.deleteStudent("STUDENTLIST_URI", HTTPMethods.returnId);
		}
	
	

}
