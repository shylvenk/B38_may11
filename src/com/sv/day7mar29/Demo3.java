package com.sv.day7mar29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
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
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
		// enter the password
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");
		// click on login button
		driver.findElement(By.cssSelector("#btnLogin")).click();

		// Verify that home page is displayed
		String actulURL = driver.getCurrentUrl();
		System.out.println("actulURL:" + actulURL);
		String expectedURL = "dashboard";
		System.out.println("expectedURL:" + expectedURL);

		if (actulURL.contains(expectedURL)) {
			System.out.println("Pass:Home Page is Displayed");
		} else {
			System.out.println("Fail:Home Page is Not Displayed");
		}

		driver.quit();
	}
}
