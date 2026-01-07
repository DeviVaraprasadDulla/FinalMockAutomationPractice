package com.practice.TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A_Parameters {
	
	
	@Parameters({"url","browser"})
	@Test
	public void getParameterFromSuiteFile(String url,String browser) {
		System.out.println(url);
		System.out.println(browser);
	}

}
