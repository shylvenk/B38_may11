package com.sv.day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		/*
		 * WebDriver is an Interface; 
		 * driver is a ref var; 
		 * = is assignment operator ;
		 * new is a keyword to create an Object;
		 * ChromeDriver() is the constructor;
		 * ; is statement terminator
		 */

		// Open the Chrome Browser
		WebDriver driver = new ChromeDriver();
		// Enter the url
		driver.get("http://www.fb.com");
		// get the title of the page
		String title = driver.getTitle();
		System.out.println(title);
		// get the url present in addressabar
		String url = driver.getCurrentUrl();
		System.out.println(url);
		// close the browser
		driver.close();
	}

}
