package com.zert.java.testng.logical;

public class FactorialFinder {

	public int findFactorial(int number) {
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	
	public int findFactorialUsingRecurssion(int n) {
		if (n == 0)
			return 1;
		else {
			return (n * findFactorialUsingRecurssion(n - 1));
		}
	}

}
