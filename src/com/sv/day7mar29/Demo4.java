package com.sv.day7mar29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// open the browser
		WebDriver driver = new ChromeDriver();
		// enter the url
		driver.get(
				"file:///C:/Users/shylaja.venkatesha/OneDrive%20-%20Accenture/Java%20Selenium/Java/Selenium%20code/Demo3.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath("./html/body/div/input")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/input")).sendKeys("hi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/input[2]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("hi");

		driver.close();
	}

}
