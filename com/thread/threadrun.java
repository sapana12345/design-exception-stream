package com.thread;
class thread1 implements Runnable{
	int n;
	public void run() {
		for(int i=0;i<n;i++) {
			System.out.println("thread 1running:");
		}
	}
}
//class thread2 implements Runnable{
//	public void run() {
//		for(int i=0;i<5;i++) {
//			System.out.println("thread 2running:");
//		}
//	}
//}class thread3 implements Runnable{
//	public void run() {
//		for(int i=0;i<10;i++) {
//			System.out.println("thread 1running:");
//		}
//	}
//}
public class threadrun {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread1 t1=new thread1(t);
		Thread t=new Thread();
		
		t1.start();
//         thread2 t2=new thread2();
//		t2.start();
//		thread3 t3=new thread3();
//		t3.start();

	}

}
