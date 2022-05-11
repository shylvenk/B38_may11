package com.sv.day11apr5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Demo2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/shylaja.venkatesha/OneDrive%20-%20Accenture/Java%20Selenium/Java/Selenium%20code/table.html");
		// find the independent element
		WebElement java = driver.findElement(By.xpath("//td[.='Java']"));
//		driver.findElement(with(By.tagName("input")).toLeftOf(java)).click();

		driver.findElement(with(By.tagName("input")).toLeftOf(By.xpath("//td[.='Java']"))).click();
	}
}
