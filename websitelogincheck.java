package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;

	 @BeforeTest
	 
	  public void openbrowser() {
		  driver = new ChromeDriver();
		  driver.get("https://the-internet.herokuapp.com/login");
	      driver.manage().window().maximize();
	      System.out.println("Browser was launached");

			}
	 @Test
	   public void login() {
		  driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("tomsmith");
		  driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("SuperSecretPassword!");
		  driver.findElement(By.xpath("//*[@id=\'login\']/button/i")).click();	  
		  String actualurl = driver.getCurrentUrl();
	      String expectedurl= "https://the-internet.herokuapp.com/secure";
	      Assert.assertEquals(actualurl, expectedurl);
	      System.out.println("Actual URL is same as the Expected URL");
	      Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\'content\']/div/a")).isDisplayed());
	      System.out.println("Logout button is visible");
	      Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\'content\']/div/h4")).isDisplayed());
	      System.out.println("Expected message is equal to Actual message");
	   }
	   
	 @AfterTest
	 public void closebrowser()  {
		 
	 	 driver.close();   
	     System.out.println("Browser was closed");

	   
	}

}
