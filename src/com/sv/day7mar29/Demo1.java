package com.sv.day7mar29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	//tag id name

	//class linktext
	//partialLinkText css xpath
	// if locatator

	static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
			// open the browser
			WebDriver driver = new ChromeDriver();
			// enter the url
			driver.get("https://opensource-demo.orangehrmlive.com/");
			// enter the user name
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			// enter the password
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			// click on login button
			driver.findElement(By.id("btnLogin")).click();

			// Verify that home page is displayed
			String actualURL = driver.getCurrentUrl();
			System.out.println("actulURL:" + actualURL);
			String expectedURL = "dashboard";
			System.out.println("expectedURL:" + expectedURL);

			if (actualURL.contains(expectedURL)) {
				System.out.println("Pass:Home Page is Displayed");
			} else {
				System.out.println("Fail:Home Page is Not Displayed");
			}

			driver.quit();
		}
}
