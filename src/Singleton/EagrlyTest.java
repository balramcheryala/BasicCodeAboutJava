package Singleton;

public class EagrlyTest {
	public static void main(String[] args) {

		SingletonEX ex1 = SingletonEX.getInstance();
		SingletonEX ex2 = SingletonEX.getInstance();
		SingletonEX ex3 = SingletonEX.getInstance();

		System.out.println(ex1 == ex2);
		System.out.println(ex2.hashCode());
		System.out.println(ex1.hashCode());
		System.out.println(ex3.toString());
		System.out.println(ex1.toString());
	}
}
