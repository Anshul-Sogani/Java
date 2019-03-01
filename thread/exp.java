package thread;

public class exp {

	public static void main(String[] args) {

		Runnable obj1 = ()->
				
				/*new Runnable() {

			public void run() */{
					

				for (int i = 0; i < 5; i++) {
					System.out.println("Hello!");
					try {
						Thread.sleep(500);
					} catch (Exception e) {
					}
				}

			
		};

		Runnable obj2 =()-> 
			
		/*new Runnable() {
			public void run() {*/{
				for (int i = 0; i < 5; i++) {
					System.out.println("hey!");
					try {
						Thread.sleep(500);
					} catch (Exception e) {
					}

				}
			
		};
		
		// Directly using the thread not decreasing the number of lines in the code!
		Thread t1 =new Thread (()-> 
		
		{
			for (int i = 0; i < 5; i++) {
				System.out.println("hey!");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}

			}
		});
		
		t1.start();
		
		Thread t2 = new Thread (obj2);
		t2.start();
	}

}
