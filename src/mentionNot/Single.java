package mentionNot;

public class Single {

	private Single() {

	}

	public static Single getInstance() {
		return INSTANCE;
	}

	public static final Single INSTANCE = new Single();

	public static void main(String[] args) {

		Single si = Single.getInstance();
		System.out.println(si);
		Single sii = Single.getInstance();
		System.out.println(sii);
	}
}
