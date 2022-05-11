package com.sv.day11apr5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/shylaja.venkatesha/OneDrive%20-%20Accenture/Java%20Selenium/Java/Selenium%20code/Element.html");
		try {
			driver.findElement(By.id("A4")).sendKeys("a");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			driver.findElement(By.id("A4")).clear();
		} catch (Exception e) {
			System.out.println(e);
		}

		driver.quit();
	}
}
