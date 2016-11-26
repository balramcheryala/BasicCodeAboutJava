package NullPointerEXP;

import java.util.Objects;

public class NuLL {
	private final String names;

	public NuLL(String name) {
		this.names = Objects.requireNonNull(name);
	}

	public void print() {
		printString(names);
	}

	private void printString(String s) {
		System.out.println(s + " (" + s.length() + ")");
	}

	public static void main(String[] args) {
		NuLL printer = new NuLL("name");
		printer.print();
	}

}
