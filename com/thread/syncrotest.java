package com.thread;
class Table{
	synchronized void printTable(int n) {
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
class mythread1 extends Thread{
	Table t;

	public mythread1(Table t) {
		super();
		this.t = t;
	}
	public void run() {
		t.printTable(5);
	}
}
class mythread2 extends Thread{
	Table t;

	public mythread2(Table t) {
		super();
		this.t = t;
	}
	public void run() {
		t.printTable(100);
	}
}

public class syncrotest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Table obj=new Table();
mythread1 t1=new mythread1(obj);
mythread2 t2=new mythread2(obj);
t1.start();
t2.start();

	}

}
