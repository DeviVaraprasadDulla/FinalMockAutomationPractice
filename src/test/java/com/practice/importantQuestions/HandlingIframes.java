package com.practice.importantQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.practice.utility.baseClass.BaseClass;

public class HandlingIframes extends BaseClass {
	
	
	@Test
	public void handlingIframes() throws InterruptedException {
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id ='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id ='password']")).sendKeys("admin",Keys.ENTER);
		Thread.sleep(5000);
		
	}

}
