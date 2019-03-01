package thread;

class hi extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("hey!");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}

		}
	}
}

class hello extends Thread {

	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println("Hello!");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}

	}
}

public class threadd {
	public static void main(String[] args) throws InterruptedException {

		hi obj = new hi();
		hello obj1 = new hello();

		obj.start();
		try {
			Thread.sleep(500);
		} catch (Exception e) {
		}
		obj1.start();
		
		obj.join();
		obj1.join();
		
		
		
		System.out.println("bye");

	}
}
