package com.practice.browserWindowManagementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import com.practice.utility.baseClass.BaseClass;

public class B_Working_With_GetLocationMethod extends BaseClass {

	@Test
	public void getLocationOfElement() {
		driver.get("https://www.uber.com/");
		driver.navigate().refresh();

//		3. Get the position of the element
		Point loc = driver.findElement(By.xpath("//div[@class= 'css-gjrQew']//*[local-name()='svg']")).getLocation();
		int eleX = loc.getX();
		int eleY = loc.getY();
		System.out.println("X-co-ordinate =>" + eleX);
		System.out.println("Y-co-ordinate =>" + eleY);

	}

}
