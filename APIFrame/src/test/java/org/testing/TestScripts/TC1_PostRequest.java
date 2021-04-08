package org.testing.TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.JsonFileHandling;
import org.testing.utilities.JsonParsingsuingJsonpath;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesHandling;

import io.restassured.response.Response;

public class TC1_PostRequest {
	
	static String responseIdValue;
	public void testcase1() throws IOException
	{
		Random r=new Random();
		Integer idValue=r.nextInt();
	String bodyData=JsonFileHandling.jsonRead("../APIFrame/src/test/java/org/testing/resources/bodyData.json");
	bodyData=JsonReplacement.replaceVariable(bodyData, "id", idValue.toString());
	
	Properties pr=PropertiesHandling.ReadProperties("../APIFrame/URI.properties");
	HTTPMethods http=new HTTPMethods(pr);
	Response res=http.postRequest(bodyData, "QA_URI");
	System.out.println("statuscode is "  + res.statusCode());
	responseIdValue=JsonParsingsuingJsonpath.parseJson(res, "id");
	}

}
