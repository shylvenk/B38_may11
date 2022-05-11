package com.sv.day4;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	//what is method overloading
	//having  multiple methods with same name but with diff parameter
	//ex: driver.navigate().to(arg1);   arg1 can be String or URL
	// ex SOP
		
		//set the path of driver executable
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		}
		//how to enter url without using get method--->navigate().to() 
		//what is the diff b/w get & to?
//		--->no diff get will enter the url , to will call the get method
		public static void main(String[] args) throws InterruptedException, MalformedURLException {

		//Open the Chrome Browser	
		 WebDriver driver=new ChromeDriver();
		//Enter the url
		 driver.navigate().to("http://www.fb.com");
		 
		 Thread.sleep(1000);
		 URL url=new URL("http://www.google.com");
		 driver.navigate().to(url);
		 Thread.sleep(1000);
		 driver.navigate().back();
		 Thread.sleep(1000);
		 driver.navigate().forward();
		 Thread.sleep(1000);
		 driver.navigate().refresh();
		 Thread.sleep(1000);
		 driver.close();
//		 System.out.println("Bhanu");
//		 System.out.println(560085);
		 
		}

}
