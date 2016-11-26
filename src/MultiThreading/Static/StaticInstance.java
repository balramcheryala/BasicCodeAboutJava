package Static;

public class StaticInstance {

	public static void main(String[] args) throws Exception {

		Demo d = new Demo();
	}

}

class Demo {

	static {
		System.out.println("Static blacks calling ");
	}
	// instance block
	{
		System.out.println("Instance Block Called");
	}
}