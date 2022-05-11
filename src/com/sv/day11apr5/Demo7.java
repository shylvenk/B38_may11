package com.sv.day11apr5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/shylaja.venkatesha/OneDrive%20-%20Accenture/Java%20Selenium/Java/Selenium%20code/Element.html");
		boolean d = driver.findElement(By.id("A1")).isDisplayed();
		System.out.println(d);// true

		d = driver.findElement(By.id("A3")).isDisplayed();
		System.out.println(d);// false

		d = driver.findElement(By.id("A5")).isSelected();
		System.out.println(d);// true

		d = driver.findElement(By.id("A6")).isSelected();
		System.out.println(d);// false

		d = driver.findElement(By.id("A1")).isEnabled();
		System.out.println(d);// true

		d = driver.findElement(By.id("A4")).isEnabled();
		System.out.println(d);// false

		driver.quit();

	}

}
