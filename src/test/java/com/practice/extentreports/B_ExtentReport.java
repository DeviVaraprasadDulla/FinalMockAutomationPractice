package com.practice.extentreports;

import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.practice.utility.baseClass.BaseClass;

public class B_ExtentReport extends BaseClass{
	
	@Test
	public void bExtentReport()   {
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String base64String = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		
		String time = new Date().toString().replace(" ","_").replace(":", "_");
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("./advancedReports/b_"+time+".html");
		sparkReporter.config().setDocumentTitle("b Extent Report");
		sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setReportName("B Report Practice");
		
		
		ExtentReports extentReport = new ExtentReports();
		extentReport.attachReporter(sparkReporter);
		ExtentTest tc1 = extentReport.createTest("Test_1");
		tc1.addScreenCaptureFromBase64String(base64String,"failed");
		tc1.log(Status.INFO,"==> TC_1 Started.<==");
		
		ExtentTest tc2 = extentReport.createTest("Test_2");
		tc2.log(Status.INFO, "==> TC_2 Started.<==");
		
		
		extentReport.flush();
		
		
	}

}
