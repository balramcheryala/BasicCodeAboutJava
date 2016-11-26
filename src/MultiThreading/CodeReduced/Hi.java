package CodeReduced;

public class Hi extends Thread {

	public void show(String str) {

		System.out.println(str);
	}

	public static void main(String[] args) {
		new Thread(() -> {
			for (int i = 0; i <= 4; i++) {

				new Hi().show("hi");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		).start();

		try {
			Thread.sleep(200);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		new Thread(() -> {
			for (int i = 0; i <= 4; i++) {

				new Hi().show("hello");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		).start();
	}
}
