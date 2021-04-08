package org.testing.runner;

import java.io.IOException;

import org.testing.TestScripts.TC1_PostRequest;
import org.testing.TestScripts.TC2_GetRequest;

public class Runner {

	public static void main(String[] args) throws IOException {
		TC1_PostRequest tc1=new TC1_PostRequest();
		tc1.testcase1();
		TC2_GetRequest tc2=new TC2_GetRequest();
		tc2.testcase2();
		
	}
}
