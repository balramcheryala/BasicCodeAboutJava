package Singleton;

public class EnumTest {

	public static void main(String[] args) {
		SingletonEnum name = SingletonEnum.ENUM;
		SingletonEnum name2 = SingletonEnum.ENUM;
		System.out.println(name);
		System.out.println(name2);
	}
}
