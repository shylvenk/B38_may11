package com.sv.day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	// static block will be executed before main method
	// key is case sensitive, value is not.
	static {
		System.setProperty("webdriver.chrome.driver", "./Driver/Chromedriver.exe");
	}

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.close();
	}

}
