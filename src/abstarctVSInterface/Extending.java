package abstarctVSInterface;

public class Extending extends Abstract {

	@Override
	public void show() {
		System.out.println("Show Method");

	}

	public static void main(String[] args) {

		Extending ex = new Extending();
		ex.display();
		ex.method();
		ex.show();
	}

}
