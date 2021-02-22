package com.cg.ld.ui;

/* lambda - jdk 1.8 */
public class App03 {

	public static void main(String[] args) {
		
		Thread t = new Thread( () -> System.out.println(Thread.currentThread().getName() + " : Hello") ); 
				
		Thread t1 = new Thread( () -> {
			for(int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName() + "=>" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		
		t.start();
		t1.start();
	}

}
