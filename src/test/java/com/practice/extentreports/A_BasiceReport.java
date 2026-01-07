package com.practice.extentreports;

import java.util.Date;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class A_BasiceReport {
	
	
	@Test
	public String unique() {
		
		Date date = new Date();
		String uniqueValue = date.toString().replace(" ","_").replace(":","_");
		return uniqueValue;
	}
	
	
	@Test
	public void basicReport() {
		
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("./advancedReports/"+unique()+".html");
		
		ExtentReports extentReports = new ExtentReports();
		extentReports.attachReporter(sparkReporter);
		extentReports.createTest("Test_1").pass("Test got passed.");
		extentReports.createTest("Test_2").fail("Test Got Failed.");
		extentReports.createTest("Test_3").skip("Test got skipped.");
		extentReports.createTest("Test_4").log(Status.SKIP,"Test Got skiped");
		extentReports.createTest("Test_5").log(Status.INFO, "login");
	
		
		extentReports.flush();
		
		
	}

}
