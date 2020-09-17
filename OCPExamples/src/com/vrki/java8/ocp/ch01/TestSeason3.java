package com.vrki.java8.ocp.ch01;

public class TestSeason3 {

	public static void main(String[] args) {
		Season3 s1 = Season3.SPRING;
		s1.printHours();
		Season3 s2 = Season3.SUMMER;
		s2.printHours();
		Season3 s3 = Season3.FALL;
		s3.printHours();
		Season3 s4 = Season3.WINTER;
		s4.printHours();

		s1.printSomethingElse();
		s2.printSomethingElse();
		s3.printSomethingElse();
		s4.printSomethingElse();
	}

}
