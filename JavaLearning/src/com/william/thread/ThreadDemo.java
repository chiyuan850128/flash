package com.william.thread;

class Hi1 extends Thread {
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Hi1");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Hello1 extends Thread {
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Hello1");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Hi2 implements Runnable {
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Hi2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Hello2 implements Runnable {
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Hello2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Hi1 obj1 = new Hi1();
		Hello1 obj2 = new Hello1();
		
		obj1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj2.start();
		

		Thread t1 = new Thread(() -> {
			for(int i = 0; i < 5; i++) {
				System.out.println("Hi2 " + Thread.currentThread().getPriority());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}, "Hi2 Thread");
		
		Thread t2 = new Thread(() -> {
			for(int i = 0; i < 5; i++) {
				System.out.println("Hello2 " + Thread.currentThread().getPriority());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}, "Hello2 Thread");
		
		//t1.setName("Hi2 Thread");
		//t2.setName("Hello2 Thread");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		t1.setPriority(1);
		t1.setPriority(10);
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		
		t1.join();
		t2.join();

		System.out.println("Hi2 Thread is alive: " + t1.isAlive());
		System.out.println("Hello2 Thread is alive: " + t2.isAlive());
		System.out.println("Bye");
	}

}
