package thread;

class hi implements Runnable {

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

class hello implements Runnable {

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

public class threadimplement {

	public static void main(String[] args) throws InterruptedException {
		
		Runnable obj1 =new hi();
		hi obj2 = new hi();
		Runnable obj3 = new hello();
		Thread t1 = new Thread(obj2);
		Thread t2 = new Thread(obj3);
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		//wait and notify are the object class methods inter-thread communication
		
		System.out.println(t1.isAlive());
		

	}

}
