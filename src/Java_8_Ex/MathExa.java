package Java_8_Ex;

public class MathExa implements MathInterface {

	private int oparate(int a, int b, MathOperation math) {
		return math.operation(a, b);
	}

	public static void main(String[] args) {
		MathExa me = new MathExa();

		MathOperation add = (int a, int b) -> a + b;
		MathOperation sub = (int a, int b) -> a - b;
		MathOperation mul = (int a, int b) -> a * b;
		MathOperation div = (int a, int b) -> a / b;

		System.out.println(me.oparate(5, 1, add));
		System.out.println(me.oparate(10, 5, sub));
		System.out.println(me.oparate(10, 5, mul));
		System.out.println(me.oparate(10, 5, div));
	}

}
