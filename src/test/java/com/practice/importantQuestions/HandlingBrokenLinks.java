package com.practice.importantQuestions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.practice.utility.baseClass.BaseClass;

public class HandlingBrokenLinks extends BaseClass {
	
	
	@Test
	public void validateBrokenLinks() throws IOException {
		
		// Step:1 Navigating to the web browser
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		
		// Step:2 Get all the links from the website
		List<WebElement>links = driver.findElements(By.tagName("a"));
		
		// Step:3 Iterating thought links
		for(WebElement element : links) {
			
			//Get the link by using href attribute
			String link = element.getAttribute("href");
			
			//Checking weather the link if empty or not
			if(link==null || link.isEmpty()) {
				continue;
			}
			
		// Step:3 convert the string to url
			URL url = new URL(link);
			
		// step:4 open http connection
			HttpURLConnection httpCon =(HttpURLConnection) url.openConnection();
			httpCon.connect();
			
			if(httpCon.getResponseCode()>=400) {
				
			}
		}
		
	}

}
