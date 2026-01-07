package com.practice.shadowroot;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.practice.utility.baseClass.BaseClass;

public class A_OpenShadowRoot extends BaseClass {

	@Test
	public void interactWithOpenShadowRoot() throws InterruptedException {

		driver.get("https://shop.polymer-project.org/");
		SearchContext context  = driver.findElement(By.xpath("//shop-app")).getShadowRoot();
		
		WebElement elem = context.findElement(By.cssSelector("shop-home[name='home'][class='iron-selected']"));
		elem.getShadowRoot().findElement(By.cssSelector("a[aria-label*='Men\\'s O']")).click();
		

	}

}
