package Inheritence;

public class DogMainTest extends mammal {

	public static void main(String[] args) {

		mammal m = new mammal();
		DogMainTest d = new DogMainTest();
		System.out.println(d instanceof mammal);
		System.out.println(m instanceof Animal);
		System.out.println(d instanceof Animal);
	}
}
