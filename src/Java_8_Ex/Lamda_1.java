package Java_8_Ex;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Lamda_1 {

	public static void main(String[] args) {
		String b = "balram,cheryala,software,engineer";
		String[] a = b.split(",");

		List<String> values = Arrays.asList(a);
		System.out.println("Using Lamda Expressions");
		values.forEach(i -> System.out.println(i));
		System.out.println("Using for Each");
		for (String x : values) {
			System.out.println(x);
		}
		System.out.println("Using For Loop");
		for (int i = 0; i <= 3; i++) {
			System.out.println(values.get(i));
		}
		System.out.println("Using Iterator Interface");
		Iterator<String> itr = values.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		System.out.println("Using Consumer Interface");
		Consumer<String> c = new Consumer<String>() {

			@Override
			public void accept(String i) {

				System.out.println(i);
			}
		};
		values.forEach(c);
		System.out.println(
				"Using Consumer Interface - SAM single abstract method - It will  take only Object of consumer interface ");
		values.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);

			}
		});

		values.forEach(

				(i) ->

				System.out.println(i));
	}
}
