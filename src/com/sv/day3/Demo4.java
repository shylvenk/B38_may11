package com.sv.day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo4 {

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
		RemoteWebDriver driver1 = (RemoteWebDriver) new FirefoxDriver();
		Demo4.testA(driver1);

		RemoteWebDriver driver2 = new ChromeDriver();
		Demo4.testA(driver2);
	}

}
