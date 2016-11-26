package Multi;

public class Hello extends Thread {

	public static void show() {
		int test = 5;
		for (int i = 1; i <= test; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public void run() {

		show();

	}
}