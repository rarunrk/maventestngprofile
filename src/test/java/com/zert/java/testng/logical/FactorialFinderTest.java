package com.zert.java.testng.logical;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.zert.java.testng.base.BaseTest;

public class FactorialFinderTest extends BaseTest {
	
	FactorialFinder factorialFinder;
	
	// It runs before executing the first test method 
	@BeforeClass
	public void beforeFirstTestMethod() {
		System.out.println("FactorialFinderTest:It Runs before the first test method in this class");
		factorialFinder  = new FactorialFinder();
	}
		
	@Test
	public void findFactorial_test() {
		System.out.println("FactorialFinderTest :Test Case 1");
		int factorial = factorialFinder.findFactorial(5);
		Assert.assertEquals(factorial, 120);
	}
	
	@Test
	public void findFactorialUsingRecurssion_test() {
		System.out.println("FactorialFinderTest:Test Case 2");
		int factorial = factorialFinder.findFactorialUsingRecurssion(5);
		Assert.assertEquals(factorial, 120);
	}
	
	@AfterClass
	public void afterLastTestMethod() {
		System.out.println("FactorialFinderTest:Runs after the last test method in this class");
	}
	

}
