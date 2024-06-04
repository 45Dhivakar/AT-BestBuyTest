package com.capstoneproject;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BestBuyTest {
	 protected WebDriver driver;
	   

		@BeforeMethod
		@Parameters({"browser"})
		public void setUp(@Optional ("Firefox")String browser) {
			System.out.println("Browser: " + browser);
			  if (browser.equalsIgnoreCase("chrome")) {
					   WebDriverManager.chromedriver().setup();
					   driver = new ChromeDriver();
					  
				  }else if (browser.equalsIgnoreCase("firefox")) {
					   WebDriverManager.firefoxdriver().setup();
					  driver = new FirefoxDriver();
				  }
			driver.manage().window().maximize();
			driver.get("https://www.bestbuy.com/");
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]")).click();
		}
	   @AfterMethod 
	   public void tearDown() {
		   if(driver !=null) {
			   driver.quit();
		   }
		   
	   }
	   public WebDriver getDriver() {
	       return driver;
	   }
}

