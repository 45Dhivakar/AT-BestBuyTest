package com.capstoneproject;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CheckOutAndPayment extends BestBuyTest{
	@Test
	public void checkout()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
       WebElement clickCartField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='cart-label']")));
       clickCartField.click();
      // driver.findElement(By.xpath("//span[@class='cart-label']")).click();
		 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[@class='btn btn-lg btn-block btn-primary']")).click();
		// CheckOut Button Click
		//driver.findElement(By.id("connect-to-account-att-phone-number-error")).click();
		//Countinue to Payment Infromation 
		driver.findElement(By.xpath("//button[@fdprocessedid='y1su9n']")).click();
		//
		 // Assume user is logged in
	    driver.findElement(By.id("number")).sendKeys("4111111111111111");
	    driver.findElement(By.id("expMonth")).sendKeys("12");
	    driver.findElement(By.id("expYear")).sendKeys("2025");
	    driver.findElement(By.id("cvv")).sendKeys("123");
	   // driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN); 
	   driver.findElement(By.xpath("//button[@class='btn btn-lg btn-block btn-primary']")).click();
	}
	@Test
	public void verifyOrderPlacement() {
	   // String confirmationMessage = driver.findElement(By.cssSelector(".confirmation-message")).getText();
	   // assertTrue(confirmationMessage.contains("Thank you for your order"));
	}
}
