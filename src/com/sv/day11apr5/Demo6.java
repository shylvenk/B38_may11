package com.sv.day11apr5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/shylaja.venkatesha/OneDrive%20-%20Accenture/Java%20Selenium/Java/Selenium%20code/Element.html");
		Thread.sleep(1000);
		driver.findElement(By.id("A1")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("A1")).sendKeys("akshara");
		Thread.sleep(1000);
		driver.findElement(By.id("A5")).click();
		Thread.sleep(1000);
//		driver.findElement(By.id("A8")).click();
		driver.findElement(By.id("A8")).submit();

		// driver.findElement(By.id("A7")).submit();
	}

}
