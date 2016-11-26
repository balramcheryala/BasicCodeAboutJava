package Singleton;

public class SingletonEX {

	// Static to class instance of the class.
	public static final SingletonEX INSTANCE = new SingletonEX();

	// Private constructor so nobody can instantiate the class.
	private SingletonEX() {
	}

	// called by user to obtain instance of the class.
	public static SingletonEX getInstance() {
		return INSTANCE;

	}
}
