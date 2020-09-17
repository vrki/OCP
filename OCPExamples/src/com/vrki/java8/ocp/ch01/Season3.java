package com.vrki.java8.ocp.ch01;

public enum Season3 {

	WINTER {
		public void printHours() {
			System.out.println("short hours");
		}
	},
	SUMMER {
		public void printHours() {
			System.out.println("long hours");
		}
	},
	SPRING, FALL;


	public void printHours() {
		System.out.println("default hours");
	}
	
	public void printSomethingElse() {
		System.out.println("Something else!");
	}

}
