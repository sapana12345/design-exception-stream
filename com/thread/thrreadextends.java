package com.thread;

class thread1 extends Thread{
	public void run() {
		for(int i=0;i<9;i++) {
			System.out.println("thread 1running:");
		}
	}
}
class thread2 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("thread 2running:");
		}
	}
}class thread3 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("thread 1running:");
		}
	}
}
public class thrreadextends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
thread1 t1=new thread1();
t1.start();
thread2 t2=new thread2();
t2.start();
thread3 t3=new thread3();
t3.start();
	}

}
