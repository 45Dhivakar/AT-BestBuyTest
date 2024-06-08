package com.capstoneproject;

import static org.testng.Assert.assertFalse;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NavigateAndValidateTitles extends BestBuyTest {

	@Test
	public void navigateAndValidateTitle() {
		WebDriver driver = getDriver();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement clickMenuButton = driver.findElement(By.xpath("//button[@class='c-button-unstyled hamburger-menu-button']"));
		 js.executeScript("arguments[0].click();", clickMenuButton);
	}
	@Test 
	public void validateBottomLinks() {
		//WebElement clickMenuButton = driver.findElement(By.xpath("//button[@type='button']"));
		// js.executeScript("arguments[0].click();", clickMenuButton);
		  List<WebElement> bottomLinks = driver.findElements(By.cssSelector(".footer .footer-links a"));
		    for (WebElement link : bottomLinks) {
		        String url = link.getAttribute("href");
		        		    }
	}
}
