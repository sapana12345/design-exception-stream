package com.thread;
class testdaemon extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("daemon is work");
		}
		else {
			System.out.println("thread is work");

		}
	}
}

public class daemonthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testdaemon t1= new testdaemon();
		testdaemon t2= new testdaemon();
		testdaemon t3= new testdaemon();
t1.setDaemon(true);
t1.start();
t2.start();
t3.start();
	}

}
