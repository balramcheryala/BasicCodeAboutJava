package Inheritence;

public class InheritenceSuperConstructorParam {

	String name;

	InheritenceSuperConstructorParam(String name) {
		this.name = name;
	}

	public void getName() {

		System.out.println("Passed By sub Class Constructor Name is  :" + name);
	}
}
