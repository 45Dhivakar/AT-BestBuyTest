package com.capstoneproject;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AddItemFromDepartment extends BestBuyTest {

	@Test
	public void addItemFromDepartment()  {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement clickMenuButton = driver.findElement(By.xpath("//button[@class='c-button-unstyled hamburger-menu-button']"));
		 js.executeScript("arguments[0].click();", clickMenuButton);
		// driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		 WebElement clicksubMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-id='node-407']")));
		 clicksubMenu.click();
		 WebElement subMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-id='node-295']")));
		 subMenu.click();
	    
	        Actions actions = new Actions(driver);
	        // Perform hover action on the menu item
	       
	        driver.findElement(By.linkText("Laptops")).click();
	        driver.findElement(By.xpath("//*[@id=\"widget-310ac125-9416-47bf-b89d-9525647e372c\"]/div/div[2]/div[1]/div[1]/div/a")).click();
	   	     WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
	   	     try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   	    driver.findElement(By.cssSelector(".add-to-cart-button")).click();
	  
	     
	}
}


