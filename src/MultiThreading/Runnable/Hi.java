package Runnable;

public class Hi extends Thread {

	@Override
	public void run() {

		for (int i = 0; i <= 4; i++) {

			System.out.println("Hi");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {

		Hi hi = new Hi();
		hi.start();

		Runnable run = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i <= 4; i++) {

					System.out.println("Hello");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
		};

		Thread t1 = new Thread(run);
		t1.start();
	}
}
