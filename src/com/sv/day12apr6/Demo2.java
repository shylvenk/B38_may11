package com.sv.day12apr6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Demo2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");

		driver.findElement(By.xpath("//div[.='Login ']")).click();

		Thread.sleep(2000);

		String xp = "//span[contains(.,'invalid')]";

		WebElement errMsg = driver.findElement(By.xpath(xp));
		String c = errMsg.getCssValue("color");
		System.out.println(c);

		String hexaColor = Color.fromString(c).asHex();
		System.out.println(hexaColor);

		String font_type = errMsg.getCssValue("font-family");
		System.out.println(font_type);

		String font_size = errMsg.getCssValue("font-size");
		System.out.println(font_size);
		driver.quit();

	}
}
