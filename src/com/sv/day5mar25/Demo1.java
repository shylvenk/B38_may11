package com.sv.day5mar25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.fb.com");
		Thread.sleep(1000);
		// maximizes the window
		driver.manage().window().maximize();
		Thread.sleep(1000);
		// goes to fullscreen mode
		driver.manage().window().fullscreen();
		Thread.sleep(1000);
		// minimizes the window
		driver.manage().window().minimize();// only available in selenium4
	}

}
