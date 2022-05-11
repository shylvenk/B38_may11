package com.sv.assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {

	static {
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

	}

	public static void main(String[] args) throws InterruptedException {

		// open the browser
		WebDriver driver = new EdgeDriver();
		// enter the URL
		driver.get("https://www.google.com");
		// Check URL
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.close();
	}

}
