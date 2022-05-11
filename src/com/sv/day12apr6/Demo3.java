package com.sv.day12apr6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement unTB = driver.findElement(By.id("username"));

		int x = unTB.getLocation().getX();
		System.out.println("x:" + x);
		int y = unTB.getLocation().getY();
		System.out.println("y:" + y);

		int height = unTB.getSize().getHeight();
		System.out.println("height:" + height);
		int width = unTB.getSize().getWidth();
		System.out.println("width:" + width);

		x = unTB.getRect().getX();
		System.out.println("x:" + x);
		y = unTB.getRect().getY();
		System.out.println("y:" + y);
		height = unTB.getRect().getHeight();
		System.out.println("height:" + height);
		width = unTB.getRect().getWidth();
		System.out.println("width:" + width);
		driver.quit();

	}
}
