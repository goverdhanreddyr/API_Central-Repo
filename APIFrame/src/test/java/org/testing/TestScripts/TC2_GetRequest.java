package org.testing.TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.JsonFileHandling;
import org.testing.utilities.PropertiesHandling;

import io.restassured.response.Response;

public class TC2_GetRequest {
	
	public void testcase2() throws IOException
	{
	
	Properties pr=PropertiesHandling.ReadProperties("../APIFrame/URI.properties");
	String idValueforGetRequest=TC1_PostRequest.responseIdValue;
	HTTPMethods http= new HTTPMethods(pr);
	Response res=http.getRequestforSingleRecord("QA_URI",idValueforGetRequest);
	System.out.println("get request respons is");
	System.out.println(res.getStatusCode());
			System.out.println(res.asString());
	}

}
