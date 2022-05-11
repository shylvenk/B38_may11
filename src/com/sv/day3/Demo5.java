package com.sv.day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo5 {

	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	// Auto up-casting
	public static void testA(WebDriver driver) {
		driver.get("http://www.fb.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

	public static void main(String[] args) {
		WebDriver driver1 = new FirefoxDriver();
		Demo5.testA(driver1);

		WebDriver driver2 = new ChromeDriver();
		Demo5.testA(driver2);
	}
}
