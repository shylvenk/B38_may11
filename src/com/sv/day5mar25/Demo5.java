package com.sv.day5mar25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		// code in Selenium3 to open 2nd browser
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.google.com");
		Thread.sleep(2000);

		WebDriver driver1 = new ChromeDriver();
		Thread.sleep(2000);
		driver1.get("https://www.fb.com");
		
		driver.close();
	}
}
