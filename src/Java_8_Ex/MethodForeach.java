package Java_8_Ex;

import java.util.ArrayList;

public class MethodForeach {

	public static void main(String[] args) {
		ArrayList<Integer> arrayist = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			arrayist.add(i);
		}

		/*
		 * Stream<Integer> s =arrayist.stream(); s.forEach(System.out::println);
		 * s.forEach(System.out::println);
		 */
		arrayist.forEach(System.out::println);
		arrayist.forEach(System.out::println);
	}
}
