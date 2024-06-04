package com.capstoneproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SignUpAndLogin extends BestBuyTest {
 
	@Test
    public void signUpAndLogin() {
		WebDriver driver = getDriver();  
    	//driver.get("https://www.bestbuy.com/");
    	//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]")).click();
    	//driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN)
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement clickAccountMenu = wait.until(ExpectedConditions.elementToBeClickable(By.id("account-menu-account-button")));
        clickAccountMenu.click();
    	 //driver.findElement(By.id("account-menu-account-button")).click();
    	 // WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	  WebElement creatAccountField = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create Account")));
          creatAccountField.click();
    	  //driver.findElement(By.linkText("Create Account")).click();
        
         
      // Fill out sign-up form
         // Enter First Name
         driver.findElement(By.id("firstName")).sendKeys("John");
         // Enter Last Name
         driver.findElement(By.id("lastName")).sendKeys("Cena");
         // Enter Customer Email Id
         driver.findElement(By.id("email")).sendKeys("johncena45@gmail.com");
         // Enter Password Field
         driver.findElement(By.id("fld-p1")).sendKeys("#YouCanSeeMe@");
         // Enter Confirm Password Field
         driver.findElement(By.id("reenterPassword")).sendKeys("#YouCanSeeMe@");
         // Enter Phone Number
         driver.findElement(By.id("phone")).sendKeys("2015543555");
         // Click The Account Recovery
         driver.findElement(By.id("is-recovery-phone")).click();
         // Click The Create Account
         driver.findElement(By.xpath("/html/body/div[1]/div/section/main/div[2]/div/div/div[1]//form/div[8]/button")).click();
         
      // Log out and log in with the new account
         // Return To The Previous Page
         driver.findElement(By.xpath("/html/body/div[1]/div/header/div/a[2]")).click();
         new WebDriverWait(driver, Duration.ofSeconds(20));
         WebElement clickAccountMenuField = wait.until(ExpectedConditions.elementToBeClickable(By.id("account-menu-account-button")));
         clickAccountMenuField.click();
         // Click The Sign In Page Field
         WebElement signInField = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign In")));
         signInField.click();     
        driver.findElement(By.id("fld-e")).sendKeys("johncena45@gmail.com");
        // SignIn Password Enter
        driver.findElement(By.id("fld-p1")).sendKeys("#YouCanSeeMe@"); 
        // SignIn Button Click
        driver.findElement(By.xpath("/html/body/div[1]//form/div[3]/button")).click(); 
    }
}
