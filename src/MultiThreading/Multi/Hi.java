package Multi;

public class Hi extends Thread {

	public static void show() {

		int test = 5;
		for (int i = 1; i <= test; i++) {
			System.out.println("Hi");
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
