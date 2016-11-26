package Runnable;

public class PassingRunnableObj extends Thread {

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

		// Runnable run = new Runnable() { // run in future may be useful so we
		// need to pass the runnable object

		Thread t1 = new Thread(new Runnable() {
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
		});

		t1.start();
	}
}