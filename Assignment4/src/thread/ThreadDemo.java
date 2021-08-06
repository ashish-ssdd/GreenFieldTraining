package thread;

public class ThreadDemo extends Thread{

	public ThreadDemo() {
		Thread t1 = new Thread(this, "Hello");
		Thread t2 = new Thread(this, "Hola");
		Thread t3 = new Thread(this, "Konichiwa");
		t1.setPriority(4);
		t2.setPriority(8);
		t3.setPriority(10);
		
		try {
			t1.start();
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();
	}
	
	public void run() {
		try {
			for(int i = 0 ; i< 3 ;i++) {
				display();
				Thread.yield();
				sleep(1000);
			}
		}catch(InterruptedException e) {
			System.out.println(e);
		}
	}
	synchronized public void display() {
		System.out.println(Thread.currentThread().getName() + " is displaying.");
	}
	public static void main(String[] args) {
		ThreadDemo t = new ThreadDemo();
		
	}
}
