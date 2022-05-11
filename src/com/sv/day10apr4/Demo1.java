package com.sv.day10apr4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// open the browser
		WebDriver driver = new ChromeDriver();
		// enter the url
		driver.get("https://demo.actitime.com/login.do");
		// enter the user name
		driver.findElement(By.id("username")).sendKeys("admin");
		// enter the password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		// click on login button
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(3000);
		// Verify that home page is displayed
		String actulURL = driver.getCurrentUrl();
		System.out.println("actulURL:" + actulURL);
		String expectedURL = "user";
		System.out.println("expectedURL:" + expectedURL);

		if (actulURL.contains(expectedURL)) {
			System.out.println("Pass:Home Page is Displayed");
		} else {
			System.out.println("Fail:Home Page is Not Displayed");
		}

		driver.quit();
	}

}
