package com.practice.browserWindowManagementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import com.practice.utility.baseClass.BaseClass;

public class A_Working_With_Positions extends BaseClass{
	
	@Test 
	public void handlingWindowPosition() throws InterruptedException {
		driver.get("https://www.uber.com/");
		driver.navigate().refresh();
		
//		1. Get the position of the window
		Point point = driver.manage().window().getPosition();
		int xAxis = point.getX();
		int yAxis =point.getY();
		System.out.println("X-axis => "+xAxis);
		System.out.println("Y-axis => "+yAxis);
		
//		2. Set the position of the window
		driver.manage().window().setPosition(new Point(500,200));
		
		Thread.sleep(5000);
		
//		Get back to the original position
		driver.manage().window().setPosition(new Point(xAxis,yAxis));
		
		Thread.sleep(5000);
	}

}
