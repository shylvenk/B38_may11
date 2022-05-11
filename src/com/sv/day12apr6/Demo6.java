package com.sv.day12apr6;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.actitime.com/");
		Thread.sleep(4000);
		TakesScreenshot t = (TakesScreenshot) driver; // type casting
		File srcImg = t.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcImg, new File("./img/loginpage.png"));
		driver.quit();

	}
}
