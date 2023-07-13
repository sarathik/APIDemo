package org.testing.apitesting.testSteps;

import java.io.IOException;
import java.util.Properties;

import org.testing.apitesting.Utilities.HandleJSONParsing;
import org.testing.apitesting.Utilities.HandleProperties;import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HTTPMethods {
	
	Properties pr;
	String uri;
	public static String returnId;
	
	public HTTPMethods(Properties prop) {
		this.pr=prop;		
	}
	
	public Response postRequest(String bodyData, String uriKeyName) {
		
		uri = pr.getProperty(uriKeyName);
		
		Response response =
				given()
					.baseUri(uri)
					.contentType(ContentType.JSON)
				.when()
					.body(bodyData)
				.post();
		int outputCode = response.statusCode();
		System.out.println("Status :" + outputCode);
		
		returnId=HandleJSONParsing.parsingResponse(response,"id");
		
		return response;
		
	}
	
	public void getAll(String uriKeyName) {
		
		uri= pr.getProperty(uriKeyName);
		
		Response response =
				given()
					.baseUri(uri)
					.contentType(ContentType.JSON)
				.when()
					.get();
		int outputCode = response.statusCode();
		System.out.println("Status :" + outputCode);
		System.out.println(response.asPrettyString());		
	}
	
	
	public void getParticularDetail(String uriKeyname,String returnId){
		
		uri=pr.getProperty(uriKeyname)+"/"+returnId;
		System.out.println(uri);
		
		Response res = 
				given()
					.baseUri(uri)
					.contentType(ContentType.JSON)
				.when()
					.get();
		
		res.prettyPrint();
		System.out.println(res.statusCode());
		
	}
	
public void updateDetails(String uriKeyname,String returnId){
		
		uri=pr.getProperty(uriKeyname)+"/"+returnId;
		System.out.println(uri);
		
		String updateBody = "{\n" +
	            "  \"name\": \"Carpet\" \n}";
		
		Response res = 
				given()
					.baseUri(uri)
					.contentType(ContentType.JSON)
					.body(updateBody)
				.when()
					.patch();
		
		res.prettyPrint();
		System.out.println(res.statusCode());
		
	}

	public void updateallStudentDetail(String bodyData, String returnId, String uriKey) {
	
		uri = pr.getProperty(uriKey) + "/" + returnId;
		System.out.println(uri);
		
		Response res = 
				given()
					.baseUri(uri)
					.contentType(ContentType.JSON)
					.body(bodyData)
				.when()
					.put();
		res.prettyPrint();
		System.out.println(res.statusCode());
	}
	
	public void deleteStudent(String uriKey, String returnID) throws InterruptedException {
		
		uri = pr.getProperty(uriKey)+ "/" + returnID;
		System.out.println(uri);
		Thread.sleep(5000);
		Response res =
				given()
					.baseUri(uri)
					.contentType(ContentType.JSON)
				.when()
					.delete();
		System.out.println(res.statusCode());
		
	}
	
}
