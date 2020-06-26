package com.vrki.java8.ocp.ch01;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * I will try here some enums. The enum in this class cannot be public - only one class per file can be public and that file should be named
 * after that class name.
 * Probably that story goes for enums inside java class file also. That probably means that this enum will have default - package visibility
 *
 * Perhaps usage of enums this way is only for some "small enums" used just in this class. If we have to use this enum in some other classes also
 * I think it is much better to 'extract; this enum to separate file. It would be much more clear and obvious, and at the end - easier to find and use.
 * 
 * @author vrki
 *
 */
enum dayOfTheWeek {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class TestEnums {

	public static void main(String[] args) {
		
		Season.SUMMER.printExpectedVisitors();

		System.out.println("Today is: " + dayOfTheWeek.FRIDAY);
		
		// OK, let's try to create some additional enum in dayOfTheWeek

		// dayOfTheWeek newDay = dayOfTheWeek.valueOf("VRKIDAY");
		// System.out.println("The experiment with new days... here we go... the new day is: " + newDay);
		
		// Miserably failure during runtime: 'java.lang.IllegalArgumentException: No enum constant com.vrki.java8.ocp.ch01.dayOfTheWeek.VRKIDAY'
		// Reading this 'between the lines means that we cannot add dynamically new enums during runtime, probably just assign and use existing ones.
		
		dayOfTheWeek today = dayOfTheWeek.valueOf("FRIDAY");
		System.out.println("Today is - as we already said: " + today);
		
		// I found out few methods when you work with enums:
		// 1. values() - array with all possible enums
		System.out.println(Arrays.toString(dayOfTheWeek.values()));
		// 2. name() - returns the 'name' of the enum - you can do this also with toString()
		System.out.println(dayOfTheWeek.MONDAY.name());
		// 3. ordinal() returns ordinal of the enum (position in its enum declaration)
		System.out.println(dayOfTheWeek.MONDAY.ordinal());
	}

}
