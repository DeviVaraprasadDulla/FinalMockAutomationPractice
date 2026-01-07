package com.practice.jsExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.practice.utility.baseClass.BaseClass;

public class A_Task_DisableElements extends BaseClass {
	
	
	
	@Test
	public void sendValueToDisableElement() throws InterruptedException {
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement input = driver.findElement(By.name("name"));
//		js.executeScript("arguments[0].value=arguments[1]",input,"admin");
		js.executeScript("arguments[0].removeAttribute('disable')",input);
		js.executeScript("arguments[0].value=arguments[1]",input,"admin");
		Thread.sleep(5000);
		
	}
}
