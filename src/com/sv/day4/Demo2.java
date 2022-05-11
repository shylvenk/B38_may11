package com.sv.day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	// set the path of driver executable
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) {
		// Open the Chrome Browser
		WebDriver driver = new ChromeDriver();
		// Enter the url
		driver.get("http://www.fb.com");
		// get the html code of the page
		String htmlCode = driver.getPageSource();
		System.out.println(htmlCode);
		// close the browser
		driver.quit();
	}

}
