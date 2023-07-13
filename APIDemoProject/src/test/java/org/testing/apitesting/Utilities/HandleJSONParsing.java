package org.testing.apitesting.Utilities;

import io.restassured.response.Response;

public class HandleJSONParsing {	
	
	public static String parsingResponse(Response res, String idName) {
		String returnIdValue = res.jsonPath().get(idName);
		return returnIdValue;
		
	}

}
