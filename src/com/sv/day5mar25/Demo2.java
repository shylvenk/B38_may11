package com.sv.day5mar25;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.fb.com");
		Thread.sleep(1000);
		//gets pixel size of window in wxh format
		Dimension s = driver.manage().window().getSize();
		System.out.println(s);
		//allows to set size
		Dimension d = new Dimension(800, 800);
		driver.manage().window().setSize(d);
	}

}
