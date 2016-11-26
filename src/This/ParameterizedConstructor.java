package This;

public class ParameterizedConstructor {

	public ParameterizedConstructor() {
		System.out.println("Zero Param");
	}

	public ParameterizedConstructor(int a) {
		System.out.println("One Param :"+a);
	}

	public ParameterizedConstructor(int a, int b) {
		this(10);
		System.out.println("Two Param :"+a+" "+b);
	}

	public static void main(String[] args) {
		new ParameterizedConstructor(10, 20);

	}
}
