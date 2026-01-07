package com.practice.importantQuestions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.practice.utility.baseClass.BaseClass;

public class HandlingWindows extends BaseClass {
	WebDriver driver = null;

	@Test
	public void handlingWindows() throws InterruptedException {
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		driver.findElement(By.xpath("//h2[text()='Watches']/ancestor::div[@class='p-4']/button")).click();

		String parentWindow = driver.getWindowHandle();
		Set<String> childWindows = driver.getWindowHandles();

		for (String win : childWindows) {
			if (!win.equals(parentWindow)) {
				String outCome = driver.switchTo().window(win).getTitle();
				if (outCome.equals("Demoapps - Luxury Watch")) {
					driver.manage().window().maximize();
					driver.findElement(By.xpath("//button[contains(text(),'Add to Cart')]")).click();
					break;
				}
			}
		}
		driver.switchTo().window(parentWindow);
	}

}
