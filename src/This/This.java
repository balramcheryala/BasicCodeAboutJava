package This;

public class This {

	int i;
	String name;
	String test;

	/*
	 * Without this output 0, null
	 */
	public This(int i, String name) {
		i = i;
		name = name;

	}

	public This(int i, String name, String test) {
		this.i = i;
		this.name = name;
		this.test = test;

	}

	public void display() {

		System.out.println(i + " " + name + "  " + test);
	}

	public static void main(String[] args) {
		System.out.println(
				"To differentiate variable of class or formal parameters of methods or constructor Use The THIS keyword");
		This th = new This(1, "Balram");
		This th1 = new This(2, "using This", "Tested");
		th.display();
		th1.display();

	}
}
