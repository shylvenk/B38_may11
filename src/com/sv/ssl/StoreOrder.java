package com.sv.ssl;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StoreOrder extends LoginSSL {
	public static String Store_product = "p-206726537";
	public static String App_url = "https://adminuat4.shopper-stop.in/";

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// enter URL
		driver.get(App_url);
		driver.manage().window().maximize();

		// **Login**
		LoginSSL a = new LoginSSL();
		a.login(driver);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class = 'user-info tier-default']")));
		driver.navigate().to(App_url + Store_product);
		driver.findElement(By.cssSelector("button.variant-size-button-206726537")).click();

	}
}
