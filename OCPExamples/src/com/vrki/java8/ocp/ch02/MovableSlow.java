package com.vrki.java8.ocp.ch02;

public interface MovableSlow {
	
	default void move() {
		System.out.println("This is a slow moving creature!");
	}
}
