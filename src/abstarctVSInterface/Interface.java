package abstarctVSInterface;

import Inheritence.Animal;

public interface Interface extends Animal{

	public abstract void show();

	public void display();

	default void method() {
		System.out.println("Interface Method");
	}

}
