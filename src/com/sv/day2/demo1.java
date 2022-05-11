package com.sv.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {
	public static void main(String[] args) throws InterruptedException {

		String key = "webdriver.chrome.driver";
		String value = "./driver/chromedriver.exe";

		System.setProperty(key, value);

		// creating obj - in java
		// opening browser - in Selenium
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		Thread.sleep(5000);

		driver.close();
	}

}
