package org.testing.apitesting.Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;


//input = json file path
//purpose = read the content of the json file
//output - return the json content in string


public class HandleJSONInput {
	
	public static String loadJSON(String filePath) throws FileNotFoundException {
		File jsonFilePath = new File(filePath);
		FileReader fileRdr = new FileReader(jsonFilePath);
		JSONTokener jtoken = new JSONTokener(fileRdr);
		JSONObject jobject = new JSONObject(jtoken);
		return jobject.toString();
	}

}
