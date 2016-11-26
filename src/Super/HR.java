package Super;

public class HR extends Employee {

	public void display() {

		System.out.println("This Is HR Display Method");
	}

	public void message() {
		super.display();// prints Employee
		display();// Prints Hr
	}

}
