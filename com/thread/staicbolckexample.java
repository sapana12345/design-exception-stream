package com.thread;
class exam{
   void printTable(int n) {
synchronized(this) {
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
}
class exam1 extends Thread{
	exam t;

	public exam1(exam t) {
		super();
		this.t = t;
	}
	public void run() {
		t.printTable(5);
	}
}

class exam2 extends Thread{
	exam t;

	public exam2(exam t) {
		super();
		this.t = t;
	}
	public void run() {
		t.printTable(100);
	}
}




public class staicbolckexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exam e=new exam();
		exam1 e1=new exam1(e);
		exam2 e2=new exam2(e);
		e1.start();
		e2.start();

	}
}
