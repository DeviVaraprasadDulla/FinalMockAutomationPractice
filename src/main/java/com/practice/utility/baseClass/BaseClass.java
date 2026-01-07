package com.practice.utility.baseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public WebDriver driver = null;
	
	@Parameters({"browser"})
	@BeforeMethod
	public void lanuchBrowser(@Optional("chrome") String browser) {
		
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}else {
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}

}
