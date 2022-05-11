package com.sv.day5mar25;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
//			 WebElement e = driver.switchTo().activeElement();
//			 e.sendKeys("bhanu");
		Thread.sleep(1000);
		driver.switchTo().activeElement().sendKeys("admin");
		Thread.sleep(1000);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		Thread.sleep(1000);
		driver.switchTo().activeElement().sendKeys("manager");
		Thread.sleep(1000);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		driver.close();
	}
}
