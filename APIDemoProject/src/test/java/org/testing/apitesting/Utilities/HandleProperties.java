package org.testing.apitesting.Utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;

//Input Parameter - file location of the property file
//Purpose - to load the properties
//output Parameter - return the property object

public class HandleProperties {
	
	public static Properties loadProperties() throws IOException {
		
		File propertyFilePath = new File("../APIDemoProject/URI.properties");
		FileReader fileRead = new FileReader(propertyFilePath);
		Properties properties = new Properties();
		properties.load(fileRead);
		return properties; //return properties object
	}

}
