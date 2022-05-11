package com.sv.day11apr5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	/*
	 * ensure that both the check boxes are selected if its not selected click it if
	 * its already selected do nothing
	 * 
	 */
	public static void selectCheckBox(WebElement checkbox) {
		if (!checkbox.isSelected()) {
			checkbox.click();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/shylaja.venkatesha/OneDrive%20-%20Accenture/Java%20Selenium/Java/Selenium%20code/Element.html");

		WebElement a5 = driver.findElement(By.id("A5"));
		selectCheckBox(a5);

		WebElement a6 = driver.findElement(By.id("A6"));
		selectCheckBox(a6);

	}
}
