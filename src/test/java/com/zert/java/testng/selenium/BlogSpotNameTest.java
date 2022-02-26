package com.zert.java.testng.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BlogSpotNameTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void initateDriverClass() {
		System.out.println("BlogSpotNameTest:initateDriverClass is invoked");
		System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.get("http://only-testing-blog.blogspot.com/2014/02/attributes.html?m=1");
	}
	
	@Test
	public void testIfFirstNameIsEnabled() {
		WebElement webElement = driver.findElement(By.id("text1")); 
		String disabledAttribute = webElement.getAttribute("disabled"); 
		Assert.assertNull(disabledAttribute);
		Assert.assertEquals(disabledAttribute, null);
	}
	
	
	@Test
	public void testIfLastNameIsDisabled() {
		WebElement webElement = driver.findElement(By.id("text2")); 
		String disabledAttribute = webElement.getAttribute("disabled"); 
		Assert.assertNotNull(disabledAttribute);
	}
	
	@AfterClass
	public void closeDriverClass() {
		System.out.println("BlogSpotNameTest:closeDriverClass is invoked");
	//	driver.close();
		// driver.quit();
	}

}
