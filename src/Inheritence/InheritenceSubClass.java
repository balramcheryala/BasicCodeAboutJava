package Inheritence;

public class InheritenceSubClass extends InheritenceSuperClass {

	int age = 25;

	public void display() {
		System.out.println("This is Sub Class");
	}

	public void InstanceCreate() {

		InheritenceSubClass sub = new InheritenceSubClass();

		sub.display();// calling sub class method

		super.display();// calling Super Class method

		System.out.println("Sub int : " + sub.age);
		System.out.println("Super int : " + super.age);
	}

	public static void main(String[] args) {
		InheritenceSubClass sub = new InheritenceSubClass();
		sub.InstanceCreate();
	}
}
