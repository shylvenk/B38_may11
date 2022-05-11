package com.sv.day11apr5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Demo4 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/shylaja.venkatesha/OneDrive%20-%20Accenture/Java%20Selenium/Java/Selenium%20code/table.html");
		Thread.sleep(1000);
		driver.findElement(with(By.tagName("input")).toLeftOf(By.xpath("//td[.='Java']"))).click();
		Thread.sleep(1000);
		driver.get(
				"file:///C:/Users/shylaja.venkatesha/OneDrive%20-%20Accenture/Java%20Selenium/Java/Selenium%20code/table2.html");
		Thread.sleep(1000);
		driver.findElement(with(By.tagName("input")).near(By.xpath("//td[.='Java']"))).click();

	}

}
