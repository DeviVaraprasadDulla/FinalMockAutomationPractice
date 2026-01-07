package com.practice.TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A_OptionalParameters {
	
	
	@Parameters({"userName","password"})
	@Test
	public void optionalParameter(String userName,String password) {
		System.out.println("User Name:"+userName);
		System.out.println("Password:"+password);
	}
	

}
