package com.vrki.java8.ocp.ch01;

/**
 * This approach have a huge advantage. The feedAnimal() method doesn't need to
 * change when we add a new AnimalToBeOverridden subclass.
 * 
 * This is example for "virtual method invocation"
 * 
 * Instance variables cannot be overridden, so you will always use value for an
 * instance variable from reference variable
 * 
 * It is great idea to get in the habit of using @Override in order to avoid
 * accidentally overloading the method!
 * 
 * @author vrki
 *
 */
public class Overridding {

	public static void main(String[] args) {

		AnimalToBeOverridden animalCow = new Cow();
		animalCow.feed();

		AnimalToBeOverridden animalBird = new Bird();
		animalBird.feed();

		AnimalToBeOverridden animalLion = new Lion();
		animalLion.feed();
	}
}

abstract class AnimalToBeOverridden {
	String name = "Generic name [AnimalToBeOverridden class]";

	public abstract void feed();

	public void printName() {
		System.out.println(name);
	}
}

class Cow extends AnimalToBeOverridden {
	String name = "Berta the Cow [Cow class]";

	@Override
	public void feed() {
		addHay();
	}

	private void addHay() {
		System.out.print("The Cow  is happy now and the name is: ");
		printName();
	}
}

class Bird extends AnimalToBeOverridden {
	String name = "Nerd the Bird [Bird class]";

	@Override
	public void feed() {
		addSeed();
	}

	private void addSeed() {
		System.out.print("The Bird is happy now and the name is: ");
		printName();
	}
}

class Lion extends AnimalToBeOverridden {
	String name = "Zion the Lion [Lion class]";

	@Override
	public void feed() {
		addMeat();
	}

	private void addMeat() {
		System.out.print("The Lion is happy now and the name is: ");
		printName();
	}
}