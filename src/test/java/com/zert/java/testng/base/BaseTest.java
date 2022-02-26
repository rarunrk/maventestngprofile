package com.zert.java.testng.base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	@BeforeSuite
	public void beforeSuiteExecutes() {
		System.out.println("Invoked before each of the test suite");
	}
	
	@BeforeTest
	public void beforeEachTest() {
		System.out.println("Invoked before each of the Test");
	}
	
	@AfterTest
	public void afterEachTest() {
		System.out.println("Invoked after each of the Test");
	}
	
	@AfterSuite
	public void afterSuiteExecutes() {
		System.out.println("Invoked after each of the test suite");
	}
	
}
