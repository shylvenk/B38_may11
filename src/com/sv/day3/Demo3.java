package com.sv.day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void testChrome(ChromeDriver cd) {
		// WebDriver driverc = new ChromeDriver();
		cd.get("https://www.shoppersstop.com/");
		String t = cd.getTitle();
		System.out.println(t);
	}

	public static void testFirefox(FirefoxDriver fd) {
		fd.get("https://www.shoppersstop.com/");
		String t = fd.getTitle();
		System.out.println(t);
	}

	public static void main(String[] args) {
		ChromeDriver driverc = new ChromeDriver();
		testChrome(driverc);

		FirefoxDriver driverf = new FirefoxDriver();
		testFirefox(driverf);

		driverc.close();
		driverf.close();
	}

	/*
	 * static { System.setProperty("webdriver.gecko.driver",
	 * "./driver/geckodriver.exe"); System.setProperty("webdriver.chrome.driver",
	 * "./driver/chromedriver.exe"); }
	 * 
	 * public static void testA(FirefoxDriver driver) {
	 * driver.get("http://www.fb.com"); String title = driver.getTitle();
	 * System.out.println(title); driver.close(); }
	 * 
	 * public static void testA(ChromeDriver driver) {
	 * driver.get("http://www.fb.com"); String title = driver.getTitle();
	 * System.out.println(title); driver.close(); }
	 * 
	 * public static void main(String[] args) { FirefoxDriver driver = new
	 * FirefoxDriver(); Demo3.testA(driver);
	 * 
	 * ChromeDriver bhanu = new ChromeDriver(); Demo3.testA(bhanu); }
	 */

}
