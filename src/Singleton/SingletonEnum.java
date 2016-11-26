package Singleton;

public enum SingletonEnum {

	ENUM;

	@Override
	public String toString() {
		return getDeclaringClass().getCanonicalName() + "@" + hashCode();

	}

}
