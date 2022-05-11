package com.sv.day6mar28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver browser = new ChromeDriver();
		browser.get(
				"file:///C:/Users/shylaja.venkatesha/OneDrive%20-%20Accenture/Java%20Selenium/Java/Selenium%20code/Demo.html");

//		 //identify the element
//		 WebElement element = driver.findElement(By.tagName("a"));
//		 
//		 //action
//		 element.click();

		// in the browser find the element by tag name 'a' and click on it
		browser.findElement(By.tagName("a")).click();

	}
}
