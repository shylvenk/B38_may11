package com.sv.day12apr6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void selectCheckBox(WebElement checkbox) {
		if (!checkbox.isSelected()) {
			checkbox.click();
		}

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/shylaja.venkatesha/OneDrive%20-%20Accenture/Java%20Selenium/Java/Selenium%20code/Element.html");

		String v = driver.findElement(By.id("A1")).getAttribute("value");
		System.out.println(v);

		String v2 = driver.findElement(By.id("A1")).getAttribute("type");
		System.out.println(v2);

		String url = driver.findElement(By.id("A2")).getAttribute("href");
		System.out.println(url);

		String tag = driver.findElement(By.id("A2")).getTagName();
		System.out.println(tag);

		String text = driver.findElement(By.id("A2")).getText();
		System.out.println(text);

		driver.quit();

	}

}
