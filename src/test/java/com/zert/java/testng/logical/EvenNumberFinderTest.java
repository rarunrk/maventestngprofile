package com.zert.java.testng.logical;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.zert.java.testng.base.BaseTest;

public class EvenNumberFinderTest extends BaseTest{
	
	@Test
	public void isEvenNumber_test_positive() {
		EvenNumberFinder evenNumberFinder = new EvenNumberFinder();
		boolean result = evenNumberFinder.isEvenNumber(14); 
		Assert.assertTrue(result);
	}
	
	
	@Test
	public void isEvenNumber_test_negative() {
		EvenNumberFinder evenNumberFinder = new EvenNumberFinder();
		boolean result = evenNumberFinder.isEvenNumber(15); 
		Assert.assertEquals(result, false);
		Assert.assertFalse(result);
	}

}
