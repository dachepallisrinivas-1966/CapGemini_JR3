package com.cg.ld.ui;

class ChildThread implements Runnable {

	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + "=>" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class App01 {

	public static void main(String[] args) {
		/* traditional way */ 
		ChildThread obj = new ChildThread();
		Thread t = new Thread(obj);
		t.setName("ChildThread");
		t.start();
	}

}
