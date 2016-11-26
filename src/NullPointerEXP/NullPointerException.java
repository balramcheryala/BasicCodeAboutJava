package NullPointerEXP;

public class NullPointerException {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void Boo() {
		Foo(name);
	}

	public void Foo(String s) {
		System.out.println("Null Object" + s.length());
	}

	public static void main(String[] args) {
		NullPointerException npe = new NullPointerException();
		// when we try to call a method on a Null Object Reference
		npe.Boo();

	}
}
