package com.capstoneproject;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

public class BestBuyTest1 {
    WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @BeforeTest
    public void setUp() {
    	System.setProperty("Webdriver.chrome.driver","C:\\Users\\Dell\\eclipse\\chrome-win64.exe");
    	//System.setProperty("Webdriver.gecko.driver","C:\\Users\\Dell\\Downloads\\geckodriver-v0.34.0-win64.exe");
    	//WebDriver driver = new FirefoxDriver();
    	//driver = new FirefoxDriver();
       driver = new ChromeDriver();
       driver.manage().window().maximize();
    }

    @Test
    public void navigateToBestBuy() {
        driver.get("https://www.bestbuy.com/");
        
        // Validate if the URL is correct
        assertEquals("https://www.bestbuy.com/", driver.getCurrentUrl());
    }

    @AfterTest
   public void tearDown() {
      driver.quit();
   }
    @Test
    public void validateURL() {
        driver.get("https://www.bestbuy.com/");
        try {
            driver.findElement(By.id("someElement"));
            // If element is found, the link is not broken
            System.out.println("Link is valid.");
        } catch (NoSuchElementException e) {
            System.out.println("Link is broken.");
        }
    }
    
	 @Test 
	    public void signUpAndLogin() {
	   
	    	driver.get("https://www.bestbuy.com/");
	    	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]")).click();
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
	 // @Test
	public void navigateAndValidateTitles() {
		 driver.get("https://www.bestbuy.com/");
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0));
		  try {
		 WebElement clickAccountMenu = wait.until(ExpectedConditions.elementToBeClickable(By.id("account-menu-account-button")));
			  //WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@type='button'])[2]")));
		   System.out.println("Button found: " + clickAccountMenu.getText());
		    clickAccountMenu.click();
		    } catch (Exception e) {
		      System.out.println("Button not found.");
		       e.printStackTrace();
		   } 
}

	 @Test
	 public void validateBottomLinks() {
	     List<WebElement> bottomLinks = driver.findElements(By.cssSelector(".footer .footer-links a"));
	     for (WebElement link : bottomLinks) {
	         String url = link.getAttribute("href");
	         assertFalse(isLinkBroken(url), "Link is broken: " + url);
	     }
	 }

	private boolean isLinkBroken(String url) {
		// TODO Auto-generated method stub
		return false;
	}
	@Test 
	public void searchAndAddToCart()  {
		//header
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		  driver.findElement(By.id("gh-search-input")).sendKeys("Laptop");
		    driver.findElement(By.cssSelector(".header-search-button")).click();
		    driver.findElement(By.cssSelector(".sku-title a")).click();
		    driver.findElement(By.cssSelector(".add-to-cart-button")).click();
		 
		
	
	
	}
}
	


   

	

    
    
