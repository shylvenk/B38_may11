package com.sv.day5mar25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// open the browser
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		// open google.com
		driver.get("http://www.google.com");
		Thread.sleep(1000);
		// open new tab - only present in Selenium4
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(1000);
		// open gmail.com
		driver.get("http://www.gmail.com");
		// open new window - only present in Selenium4
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(1000);
		// open fb.com
		driver.get("http://www.fb.com");
		Thread.sleep(1000);
		// closes all opened browsers
		driver.quit();

	}

}
