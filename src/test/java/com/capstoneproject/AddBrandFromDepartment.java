package com.capstoneproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AddBrandFromDepartment  extends BestBuyTest{
	
	@Test
	public void addItemFromBrand() {
	
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement clickMenuButton = driver.findElement(By.xpath("//button[@class='c-button-unstyled hamburger-menu-button']"));
			 js.executeScript("arguments[0].click();", clickMenuButton);
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			 driver.findElement(By.xpath("//button[@data-id='node-82']")).click();
			 driver.findElement(By.xpath("//a[@data-lid='ubr_shp_apl']")).click();
			 driver.findElement(By.xpath("//*[@id=\"widget-9bc5db23-9f62-4ded-8b58-511aee4ea7b9\"]/div/div[2]/div[1]/div[1]/div/a")).click();
			 driver.findElement(By.xpath("//*[@id=\"widget-c49b675f-f9aa-4d6b-9e6d-cca0fb66be41\"]/div/div[2]/div[1]/div[1]/div/a")).click();
			 driver.findElement(By.cssSelector(".add-to-cart-button")).click();
	}

}
