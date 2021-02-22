package com.cg.ld.ui;

/* anonymous class - till jdk 1.7 */
public class App02 {

	public static void main(String[] args) {
		
		Thread t = new Thread(new Runnable() {
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
		});
		t.start();
	}

}
