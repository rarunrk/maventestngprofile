package com.zert.java.testng.tutorial;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.zert.java.testng.base.BaseTest;

public class SquareCubeFinderTest extends BaseTest {
	
	
	SquareCubeFinder finder;
	
	@BeforeClass
	public void  setMathObject() {
		System.out.println("SquareCubeFinderTest:It Runs before the first test method in this class");
		finder = new SquareCubeFinder();
	}
	
	@Test
	public void findSquare_test() {
		System.out.println("SquareCubeFinderTest:Test Case 1");
		int result = finder.findSquare(8);
		Assert.assertEquals(result, 64);
	}
	
	@Test
	public void findCube_test() {
		System.out.println("SquareCubeFinderTest:Test Case 1");
		int result = finder.findCube(2);
		Assert.assertEquals(result, 8);
	}
	
	@AfterClass
	public void afterLastTestMethod() {
		System.out.println("SquareCubeFinderTest:Runs after the last test method in this class");
	}
	
}
