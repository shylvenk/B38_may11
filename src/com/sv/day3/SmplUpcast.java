package com.sv.day3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SmplUpcast {

	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void testA(FirefoxDriver driver) {
		driver.get("http://www.fb.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

	public static void testA(ChromeDriver driver) {
		driver.get("http://www.fb.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		SmplUpcast.testA(driver);

		ChromeDriver bhanu = new ChromeDriver();
		SmplUpcast.testA(bhanu);
	}
}
