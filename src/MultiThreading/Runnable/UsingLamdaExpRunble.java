package Runnable;

public class UsingLamdaExpRunble extends Thread {

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

		UsingLamdaExpRunble u1 = new UsingLamdaExpRunble();
		u1.start();

		/*
		 * Runnable r1 = new Runnable() {
		 * 
		 * @Override public void run() { for (int i = 0; i <= 4; i++) {
		 * System.out.println("Hello"); try { Thread.sleep(2000); } catch
		 * (InterruptedException e) { e.printStackTrace(); } }
		 * 
		 * } };
		 */

		Thread t1 = new Thread(() -> {
			for (int i = 0; i <= 4; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

		});

		t1.start();

	}

}
