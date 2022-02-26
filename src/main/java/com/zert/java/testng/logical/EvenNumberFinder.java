package com.zert.java.testng.logical;

public class EvenNumberFinder {
	
	public boolean isEvenNumber(int number){
       boolean isEven = false; 
       if(number%2==0) {
    	   isEven = true; 
       }
       return isEven; 
    }

}
