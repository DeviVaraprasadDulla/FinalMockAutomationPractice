package com.finalMock.sliders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SinglePointerSlider {
	WebDriver driver = null;
	
	@BeforeMethod
	public void lauchDriver() {
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
	}

	@Test
	public void movingSinglePointerSlider() throws InterruptedException {
		driver.get("https://jqueryui.com/slider/");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(frame);
		
		WebElement sliderPointer = driver.findElement(By.xpath("//span[contains(@class,'ui')]"));
		Actions actions = new Actions(driver);
		actions.clickAndHold(sliderPointer).moveByOffset(50, 0).release().perform();
		Thread.sleep(5000);
	}
	
	
	@Test
	public void movingTwoPointerSliderInAmazon() throws InterruptedException {
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung mobiles",Keys.ENTER);
		
		int width = driver.findElement(By.xpath("//div[@id='p_36/range-slider_slider-item']")).getSize().getWidth();
		SearchContext context = driver.findElement(By.id("p_36/range-slider_slider-item_lower-bound-slider")).getShadowRoot();
		SearchContext context2 = driver.findElement(By.id("p_36/range-slider_slider-item_upper-bound-slider")).getShadowRoot();
		WebElement forwardThumb  = context.findElement(By.cssSelector("#thumb"));
		WebElement backwordThumb = context2.findElement(By.cssSelector("#thumb"));
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(forwardThumb).moveByOffset(60, 0).release().perform();
		actions.clickAndHold(backwordThumb).moveByOffset(-50, 0).release().perform();
		
		Thread.sleep(5000);
	}
	@AfterMethod
	public void quitDriver() {
		driver.quit();
	}
}
