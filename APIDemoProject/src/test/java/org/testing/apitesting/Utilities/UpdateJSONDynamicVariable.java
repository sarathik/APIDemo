package org.testing.apitesting.Utilities;

import java.util.Random;
import java.util.regex.Pattern;

public class UpdateJSONDynamicVariable {
	
	public static String generateRandomId() {
		Random randomNumber = new Random();
		Integer id = randomNumber.nextInt();
		String idValue = id.toString();
		return idValue;
	}
	
	public static String replaceData(String bodyData, String varName, String varValue) {
		bodyData=bodyData.replaceAll(Pattern.quote("{{"+varName+"}}"), varValue);
		return bodyData;
		
	}

}
