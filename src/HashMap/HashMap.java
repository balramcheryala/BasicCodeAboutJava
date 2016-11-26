package HashMap;

import java.util.ArrayList;

public class HashMap {

	public static void main(String[] args) {
		long strt = System.currentTimeMillis();
		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 0; i <= 1200000; i++) {

			a.add(i);
		}

		for (Integer x : a) {
			System.out.println(x);
		}
		long end = System.currentTimeMillis();
		System.out.println((end - strt) % 60);
	}
}
