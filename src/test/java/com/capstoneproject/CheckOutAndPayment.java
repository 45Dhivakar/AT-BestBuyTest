package com.capstoneproject;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CheckOutAndPayment extends BestBuyTest{
	private String string;

	@Test
	public void checkout()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
       WebElement clickCartField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='cart-label']")));
       clickCartField.click();
       
       WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(20));
       WebElement continueButton = wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='btn btn-secondary btn-block btn-lg']")));
       continueButton.click();
       
       WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
       WebElement searchBar = wait2.until(ExpectedConditions.presenceOfElementLocated(By.id("gh-search-input")));
       searchBar.sendKeys("Laptop");
       searchBar.submit();

       // Wait for search results and add the first item to the cart
       WebElement firstProduct = wait1.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".sku-item")));
       firstProduct.click();

       // Wait for the add to cart button to be clickable and then click it
       WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(40));
       WebElement addToCartButton = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='column-right']//button[@data-button-state='ADD_TO_CART'])[2]")));
       addToCartButton.click();
       
       WebDriverWait wait4 =new WebDriverWait(driver, Duration.ofSeconds(20));
       WebElement goToCartButton = wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='c-button c-button-secondary c-button-md c-button-block ']")));
       goToCartButton.click();
       
       //WebElement pickUpmidway = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='c-radio-brand flex relative']//input[@id='fulfillment-ispu-1o34kpgpwgelr-3zedoomzmg6hb']")));
       //pickUpmidway.click();
       
       
       switchBackToOriginalTab();
       WebDriverWait wait5=new WebDriverWait(driver, Duration.ofSeconds(20));
       WebElement clickCheckoutButton = wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("(//section[@class='fluid-large-view__sidebar']//button[@type='button'])[1]")));
       clickCheckoutButton.click();
       
       switchBackToOriginalTab();
       
       WebElement signInButton = wait3.until(ExpectedConditions.elementToBeClickable(By.id("fld-e")));
       signInButton.sendKeys("johncena45@gmail.com");
 
       WebElement passwordButton = wait3.until(ExpectedConditions.elementToBeClickable(By.id("fld-p1")));
       passwordButton.sendKeys("#YouCanSeeMe@");

       WebDriverWait wait6=new WebDriverWait(driver, Duration.ofSeconds(40));
       WebElement signButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='cia-settings-container']//button[@data-track='Sign In']")));
       signButton.click();
       
       WebElement clickGuestButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='cia-secondary-content-v2']//button[@type='button']")));
       clickGuestButton.click();
       
       //WebElement clickapplyButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("changeFullfilmentButton")));
      // clickapplyButton.click();
       
     //  WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='slider-content']//input[@name='sam-input']")));
      // searchButton.sendKeys("75001");
       
      // driver.findElement(By.xpath("//button[@data-track='Update Zip Code']")).click();
       
     
      // WebElement pickUpButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='slider-content']//span[@class='pick-up-here']//button[@data-store-id='852']")));
       //pickUpButton.click();
      
      driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("John");
      driver.findElement(By.id("lastName")).sendKeys("Cena");
      driver.findElement(By.id("street")).sendKeys("51 1/2 17th Ave SW");
      driver.findElement(By.id("city")).sendKeys("Cedar Rapids");
      driver.findElement(By.id("state")).sendKeys("IA");
      driver.findElement(By.id("zipcode")).sendKeys("52404");
       
     
      
      try {
		Thread.sleep(5000);
		WebElement clickapplyButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-track='Shipping: Save shipping address']")));
	    clickapplyButton.click();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
		  
	}
    //  WebElement keepAddress = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='c-modal-window  active']//button[@data-track='Keep Address as Entered']")));
    //  keepAddress.click();
       
     //button[@data-track='Keep Address as Entered']
      
       WebDriverWait wait8=new WebDriverWait(driver, Duration.ofSeconds(30));
       driver.findElement(By.id("user.emailAddress")).sendKeys("johncena45@gmail.com");
       driver.findElement(By.id("user.phone")).sendKeys("2015543555");
       
       
       WebElement clickcheckBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='c-checkbox-brand']//input[@id='text-updates']")));
       clickcheckBox.click();
       
       try {
		Thread.sleep(5000);
		 WebElement clickcontinueButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='button--continue']//button[@class='btn btn-lg btn-block btn-secondary']")));
	     clickcontinueButton.click();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
       // Helper method to switch back to the original tab and close the new tab

		 // Assume user is logged in
	    //driver.findElement(By.id("number")).sendKeys("4111111111111111");
	   // driver.findElement(By.id("expMonth")).sendKeys("12");
	   // driver.findElement(By.id("expYear")).sendKeys("2025");
	    //driver.findElement(By.id("cvv")).sendKeys("123");
	   // driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN); 
	 //  driver.findElement(By.xpath("//button[@class='btn btn-lg btn-block btn-primary']")).click();
	}
	
	private void switchBackToOriginalTab() {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void verifyOrderPlacement() {
	 // String confirmationMessage = driver.findElement(By.cssSelector(".confirmation-message")).getText();
	  //assertTrue(confirmationMessage.contains("Thank you for your order"));
	}
}
