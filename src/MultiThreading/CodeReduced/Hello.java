package CodeReduced;

public class Hello extends Thread {

	public void show(String str) {
		for (int i = 0; i <= 4; i++) {
			System.out.println(str);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		new Thread(() -> new Hello().show("Hello")).start();
		new Thread(() -> new Hello().show("Hi")).start();
	}
}
