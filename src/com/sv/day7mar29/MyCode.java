package com.sv.day7mar29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyCode {

	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// open browser
		WebDriver driver = new FirefoxDriver();
		// enter URL
		driver.get(
				"file:///C:/Users/shylaja.venkatesha/OneDrive%20-%20Accenture/Java%20Selenium/Java/Selenium%20code/D7%20Mar29/Demo3.html");

		// enter name in A box
		driver.findElement(By.cssSelector("input[type='text']")).clear();
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Shylaja");
		Thread.sleep(1000);

		// enter name in B box
		driver.findElement(By.cssSelector("input[value='B']")).clear();
		driver.findElement(By.cssSelector("input[value='B']")).sendKeys("Venkatesha");
		Thread.sleep(1000);

		// enter name in C box
		driver.findElement(By.xpath("/html/body/div[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/div[2]/input[1]")).sendKeys("Vijay");
		Thread.sleep(1000);

		// enter name in D box
		driver.findElement(By.xpath("/html/body/div[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("Siddarth");
		Thread.sleep(1000);

		driver.close();
	}

}
