package org.testing.utilities;

import io.restassured.response.Response;

public class JsonParsingsuingJsonpath {
	public static String parseJson(Response res, String jsonpath)
	{
	return res.jsonPath().get(jsonpath).toString();
}
}

