package com.capstoneproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SearchAndAddCart  extends BestBuyTest{
	
	@Test
	public void searchAndAddToCart() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    driver.findElement(By.id("gh-search-input")).sendKeys("Laptop");
	    driver.findElement(By.cssSelector(".header-search-button")).click();
	    driver.findElement(By.cssSelector(".sku-title a")).click();
	    driver.findElement(By.cssSelector(".add-to-cart-button")).click();
	}
	
}
