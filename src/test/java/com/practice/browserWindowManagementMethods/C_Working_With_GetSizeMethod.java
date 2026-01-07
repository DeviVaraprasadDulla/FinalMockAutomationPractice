package com.practice.browserWindowManagementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

import com.practice.utility.baseClass.BaseClass;

public class C_Working_With_GetSizeMethod extends BaseClass {
	
	@Test
	public void getSizeOfElement() throws InterruptedException {
		driver.get("https://www.flipkart.com/?utm_source=chatgpt.com");
		driver.navigate().refresh();
		Thread.sleep(5000);
//		1. get the size the logo
//		Dimension dim  = driver.findElement(By.xpath("//*[local-name()='picture' and @title = 'Flipkart']")).getSize();
		
		
		//scenario for responsive testing
		driver.manage().window().setSize(new Dimension(790,400));
		Thread.sleep(2000);
		Dimension dim = driver.findElement(By.xpath("//button[contains(@title,'Se')]")).getSize();
		
		int logoWidth = dim.getWidth();
		int logoHeight = dim.getHeight();
		
		System.out.println("Width of the serach bar "+logoWidth);
		System.out.println("Height of the search bar "+logoHeight);
		
		
	}

}
