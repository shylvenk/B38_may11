package com.sv.day6mar28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/shylaja.venkatesha/OneDrive%20-%20Accenture/Java%20Selenium/Java/Selenium%20code/Demo.html");

		Thread.sleep(1000);
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.id("a1")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.name("n1")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.className("c1")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Bhanu Prakasha")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Bhanu")).click();
		// cssSelector & xpath

	}
}
