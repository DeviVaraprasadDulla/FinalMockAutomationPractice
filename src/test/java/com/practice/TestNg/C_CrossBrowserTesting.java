package com.practice.TestNg;

import org.testng.annotations.Test;

import com.practice.utility.baseClass.BaseClass;

public class C_CrossBrowserTesting extends BaseClass {
	
	
	@Test
	public void crossBrowserTesting() {
		driver.get("https://www.google.com");
	}

}
