package com.vrki.java8.ocp.ch01;

class Animal {

}

class Cat extends Animal {

	void showSomething(Cat c) {
		System.out.println("1. Exact match by type [Cat]");
	}

	void showSomething(Animal a) {
		System.out.println("2. Matching a superclass type [Animal]");
	}

	void showSomething(short s) {
		System.out.println("3. Converting to a larger primitive type [byte] -> [short]");
	}

	void showSomething(Integer i) {
		System.out.println("4. Converting to an autoboxed type [Integer]");
	}

	void showSomething(int... varArgs) {
		System.out.println("5. Varargs [int...]");
	}
}

public class Overloading {

	public static void main(String[] args) {
//		// Overloading:
//		// 1. Exact match by type
//		// 2. Matching a superclass type
//		// 3. Converting to a larger primitive type
//		// 4. Converting to an autoboxed type
//		// 5. Varargs
		
		// 1.
		new Cat().showSomething(new Cat());
		
		// 2.
		new Cat().showSomething(new Animal());

		// 3.
		byte bytePrimitive = 10;
		new Cat().showSomething(bytePrimitive);
		
		// 4.
		int intPrimitive = 10;
		new Cat().showSomething(intPrimitive);

		// 5.
		new Cat().showSomething(intPrimitive, intPrimitive, intPrimitive);
	}
}
