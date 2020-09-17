package com.vrki.java8.ocp.ch01;

public class TestOfPrivateInterface {
	
	String message = "Some message.";
	
	/*
	 * Interface also can be private and inner as well as a class - but the methods declarations (as well as implementations in
	 * inner classes must be public. This means that private interface can be referred to within the current outer class. 
	 */
	private interface Secret {
		public void shh();
	}
	
	class DontTell implements Secret {
		public void shh() {
			System.out.println("This is an implementation of a method shh from private Interface!");
		};
	};

	public static void main(String[] args) {
		TestOfPrivateInterface outer = new TestOfPrivateInterface();
		DontTell inner = outer.new DontTell(); // create Inner class
		inner.shh();
	}
}
