package Inheritence;

public class InheritenceMulMainTest extends InheritenceAddSub {
	public void multiplication(int x, int y) {
		z = x * y;
		System.out.println("The product of the given numbers:" + z);
	}

	public static void main(String args[]) {

		long startTime = System.currentTimeMillis();
		int a = 20, b = 10;
		InheritenceMulMainTest calc = new InheritenceMulMainTest();
		calc.addition(a, b);
		calc.Subtraction(a, b);
		calc.multiplication(a, b);
		long stopTime = System.currentTimeMillis() - startTime;
		System.out.println(stopTime);
	}
}