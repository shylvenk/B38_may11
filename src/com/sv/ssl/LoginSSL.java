package com.sv.ssl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginSSL {
	public void login(WebDriver driver) {

		// find login element
		driver.findElement(By.xpath("//i[@class = 'user-icon']")).click();
		// click EMail link
		driver.findElement(By.linkText("Email")).click();
		// find email text box and enter user name
		driver.findElement(By.id("emailId")).sendKeys("shylaja0119@gmail.com");
		// click continue button
		driver.findElement(By.xpath("(//div/button[@type='submit'])[7]")).click();
		// enter password
		driver.findElement(By.id("password")).sendKeys("abc@123");
		// continue button
		driver.findElement(By.xpath("(//div/button[@type='submit'])[9]")).click();
	}

}
