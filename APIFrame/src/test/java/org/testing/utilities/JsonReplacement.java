package org.testing.utilities;

import java.util.regex.Pattern;

public class JsonReplacement {
	
	public static String replaceVariable(String bodyData,String variableName, String variableValue)
	{
	
	bodyData=bodyData.replaceAll(Pattern.quote("{{"+variableName+"}}"), variableValue);
	
	return bodyData;
	}
	
	

}
