package This;

public class ThisShow {

	void display() {
		System.out.println("Step : 3 Finally display method Executed");
		System.out.println("For calling the method uses this.methodname by JVM Automatically");
	}

	void mobileNumber() {
		System.out.println("Step : 2 calling display method");
		display();
	}

	void addressOfAadhar() {
		System.out.println("Step : 1 calling mobileNumber method");
		mobileNumber();
	}

	public static void main(String[] args) {

		ThisShow ts = new ThisShow();
		ts.addressOfAadhar();
	}
}
