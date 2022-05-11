package com.sv.day12apr6;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement unTB = driver.findElement(By.cssSelector(".atLogoImg"));
		File img = unTB.getScreenshotAs(OutputType.FILE);
		String path = img.getAbsolutePath();
		System.out.println(path);
		Thread.sleep(60000);
		driver.quit();

	}
}
