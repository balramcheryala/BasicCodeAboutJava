package Dummy;

public class EstimateTime extends Thread {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		long stopTime = System.currentTimeMillis() - startTime;
		System.out.println(stopTime);
	}
}