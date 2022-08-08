package com.thread;
class X implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		System.out.println("thread  x srated");
		for(int i=1;i<=4;i++) {
			System.out.println("thread  x srated:"+i);

		}
	
		System.out.println("exit of x");

	}
	
}
class Y implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread  y srated");
		for(int j=0;j<=4;j++) {
			System.out.println("thread  ysrated:"+j);

		}
	
		System.out.println("exit of y");
	}
	
}
class Z implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread  z srated");
		for(int k=0;k<=4;k++) {
			System.out.println("thread  z srated:"+k);

		}
	
		System.out.println("exit of z");

	}
	
}
public class threadpriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
X x=new X();
Y y=new Y();
Z z=new Z();
Thread t1= new Thread(x);
Thread t2= new Thread(y);
Thread t3= new Thread(z);
t1.setPriority(Thread.MAX_PRIORITY);
t2.setPriority(t2.getPriority()+1);
t3.setPriority(Thread.MIN_PRIORITY);
t1.start();
t2.start();
t3.start();
	}

}
