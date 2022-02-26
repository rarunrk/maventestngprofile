package com.zert.java.testng.tutorial;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.zert.java.testng.base.BaseTest;

public class MathsOperationTest extends BaseTest {
	
	MathsOperation mathOperation;
	 
	@BeforeClass
	public void  setMathObject() {
		System.out.println("MathsOperationTest:It Runs before the first test method in this class");
		mathOperation = new MathsOperation();
	}
	
	@Test
	public void add_integer_test() {
		System.out.println("MathsOperationTest:Test Case 1");
		int result = mathOperation.add(5, 7);
		Assert.assertEquals(result, 12);
	}
	
	@Test
	public void add_double_test() {
		System.out.println("MathsOperationTest:Test Case 2");
		double result = mathOperation.add(5.5, 7.7);
		Assert.assertEquals(result, 13.2);
	}
	
	
	@AfterClass
	public void afterLastTestMethod() {
		System.out.println("MathsOperationTest:Runs after the last test method in this class");
	}

}
