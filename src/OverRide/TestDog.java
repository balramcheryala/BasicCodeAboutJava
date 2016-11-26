package OverRide;

public class TestDog {

	public static void main(String args[]) {
		Animal a = new Animal(); // Animal reference and object
		Animal b = new Dog(); // Animal reference but Dog object

		a.move(); // runs the method in Animal class
		b.move(); // runs the method in Dog class
		// b.bark();//This program will throw a compile time error since b's
		// reference type Animal doesn't have a method by the name of bark.

	}
}