package AsciPrint;

public class AsciiValues {

	public static void main(String[] args) {

		int i;
		for (i = 0; i <= 128; i++) {
			System.out.printf("%d, %c %n", i, i);
		}
	}
}
