package org.testing.TestSteps;

import java.util.Properties;


import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class HTTPMethods {
	
	Properties pr;
	
		public HTTPMethods(Properties pr)
		{
			this.pr=pr;
	}

	public Response postRequest(String body, String uriKey)
	{
		Response res=
	   given()
	   .contentType(ContentType.JSON)
	   .body(body)
	   .when()
	   .post(pr.getProperty(uriKey));
	    return res;
	}
	public Response getRequestforSingleRecord(String uriKey,String idValue)
	{
		String uri=pr.getProperty(uriKey)+"/"+idValue;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uri);
		
		return res;
	}
		
	
}



