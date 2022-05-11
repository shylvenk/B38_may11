package com.sv.day5mar25;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.fb.com");
		// gets x axis and y axis position
		Point cp = driver.manage().window().getPosition();
		System.out.println(cp);

		Thread.sleep(1000);
		// resizing the window
		Dimension d = new Dimension(600, 800);
		driver.manage().window().setSize(d);

		// changing position of window from right to left
		Thread.sleep(1000);
		int x = 100;
		for (int i = 0; i <= 10; i++) {
			Point p = new Point(x, 200);
			driver.manage().window().setPosition(p);
			Thread.sleep(500);
			x = x + 50;
		}

		// changing position of window from left to right
		Thread.sleep(1000);
		for (int i = 0; i <= 10; i++) {
			Point p = new Point(x, 200);
			driver.manage().window().setPosition(p);
			Thread.sleep(500);
			x = x - 50;
		}
		System.out.println("Done");
		driver.close();
	}

}
