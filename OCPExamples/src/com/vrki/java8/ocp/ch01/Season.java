package com.vrki.java8.ocp.ch01;

/**
 * There are two things to notice here:
 * 1. colon after values (this can be noted only if there is no other code after values for the enums
 * 2. the constructor is private because it can be called from within the enum - the code will not compile with public 
 * constructor (instance variable 'expectedVisitors' which constructor uses (set) can be as private as well public...)
 * 
 * The first time that we ask for any of the enum values, Java constructs all of the enum values. After that Java just
 * returns the already-constructed enum values.
 *  
 * @author vrki
 *
 */
public enum Season {
	
	WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
	
	private String expectedVisitors;
	
	private Season(String expectedVisitors) {
		this.expectedVisitors = expectedVisitors;
	}
	
	public void printExpectedVisitors() {
		System.out.println(expectedVisitors);
	}

}
