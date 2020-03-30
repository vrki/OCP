package com.vrki.java8.ocp;

class Animal {
	String className = "Animal";
}

class Cat extends Animal {
	String className = "Cat";

//	void getClassName(Cat a ) {
//		System.out.println("1. Exact match by type");
//	}
//	void getClassName(Animal a ) {
//		System.out.println("2. Matching a superclass type");
//	}
//	void getClassName(Cat... a) {
//		System.out.println("Varargs - Cat");
//	}
//	void getClassName(Animal... a) {
//		System.out.println("Varargs - Animal");
//	}
//	void getClassName(int a) {
//		System.out.println("3. Converting to a larger primitive type");
//	}
//	void getClassName(long a) {
//		System.out.println("3. Converting to a larger primitive type");
//	}
//	void getClassName(Integer a) {
//		System.out.println("4. Converting to an autoboxed type");
//	}
	void getClassName(int... varArgs) {
		System.out.println("5. Varargs");
	}
}

public class Overloading {
	// Overloading:
	// 1. Exact match by type
	// 2. Matching a superclass type
	// 3. Converting to a larger primitive type
	// 4. Converting to an autoboxed type
	// 5. Varargs

	private int someNumber = 10;

	public int getSomeNumber() {
		return someNumber;
	}

	// 1.
//	String returnSomething(int a) {
//		System.out.println("String returnSomething(int a)");
//		return "" + a;
//	}

	// 2.
//	String returnSomething(Object a) {
//		System.out.println("String returnSomething(Object a)");
//		return "" + a; 
//	}

	// 3.
//	String returnSomething(float a) {
//		System.out.println("String returnSomething(float a)");
//		return "" + a;
//	}

	// 4.
//	String returnSomething(Integer a) {
//		System.out.println("int returnSomething(Integer a)");
//		return "" + a;
//	}

	// 5.
//	String returnSomething(int ... varArgs ) {
//		System.out.println("String returnSomething(int ... varArgs)");
//		return "" + varArgs; 
//	}

//////////////////////////////////////////////////////////////////////////////////////////////////

	void getClassName(Animal a) {
		System.out.println(new Animal().className);
	}

//	void getClassName(Cat a ) {
//		System.out.println(new Cat().className);
//	}

//////////////////////////////////////////////////////////////////////////////////////////////////

	public static void main(String[] args) {
		Overloading o1 = new Overloading();

		// 1, 3, 4, 2, 5
//		o1.returnSomething(o1.getSomeNumber());

//		o1.getClassName(new Cat());

		Cat c = new Cat();
		c.getClassName(10);

	}
}
