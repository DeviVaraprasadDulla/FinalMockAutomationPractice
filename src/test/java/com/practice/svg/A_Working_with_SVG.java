package com.practice.svg;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.practice.utility.baseClass.BaseClass;

public class A_Working_with_SVG extends BaseClass {
	
	
	@Test
	public void findSVGElement() throws InterruptedException {
		
		driver.get("https://www.w3schools.com/graphics/tryit.asp?filename=trysvg_myfirst");
		driver.switchTo().frame("iframeResult");
		
		WebElement svgElement = driver.findElement(By.xpath("//*[local-name()='svg']//*[local-name()='circle']"));
		Rectangle rect = svgElement.getRect();
		int width =rect.getWidth();
		System.out.println(width);
		Thread.sleep(5000);
	}

}
