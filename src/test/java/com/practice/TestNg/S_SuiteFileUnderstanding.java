package com.practice.TestNg;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class S_SuiteFileUnderstanding {
	
	@Ignore
	@Test
	public void TC1() {
		System.out.println("Executing Test Case_1");
	}
	@Test
	public void TC2() {
		System.out.println("Executing Test Case_2");
	}
	@Test
	public void TC3() {
		System.out.println("Executing Test Case_3");
	}

}
