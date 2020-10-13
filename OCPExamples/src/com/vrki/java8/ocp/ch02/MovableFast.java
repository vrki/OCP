package com.vrki.java8.ocp.ch02;

public interface MovableFast {
	
	default void move() {
		System.out.println("This is a fast moving creature!");
	}
}
