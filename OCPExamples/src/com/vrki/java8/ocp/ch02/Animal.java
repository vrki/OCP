package com.vrki.java8.ocp.ch02;

public class Animal implements MovableFast, MovableSlow {

	// Without this method declared this file will not compile because we already have two default move methods in both interfaces
	public void move() {
		System.out.println("This is a default moving creature!");
	}
	
	public static void main(String args[]) {
		new Animal().move();
	}
}
