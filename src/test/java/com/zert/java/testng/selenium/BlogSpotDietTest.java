package com.zert.java.testng.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BlogSpotDietTest {
	
WebDriver driver;
	
	@BeforeClass
	public void initateDriverClass() {
		System.out.println("BlogSpotDietTest:initateDriverClass is invoked");
		System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.get("http://only-testing-blog.blogspot.com/2014/02/attributes.html?m=1");
	}
	
	@Test
	public void testDietOptions() {
		List<WebElement> webElementList = driver.findElements(By.xpath("//input[@type='checkbox']"));
		Assert.assertEquals(webElementList.size(), 3);
	}
	
	@AfterClass
	public void closeDriverClass() {
		System.out.println("BlogSpotDietTest:closeDriverClass is invoked");
		driver.close();
		driver.quit();
	}

}
