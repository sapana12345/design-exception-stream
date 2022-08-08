package com.thread;
class fibo1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
				int n=12;
				int f1=0,f2=1,f3;
				for(int i=1;i<=n;i++) {
					f3=f1+f2;
					System.out.println(" "+f3);
					f1=f2;
					f2=f3;
	}
	
}
}
class printmulti implements Runnable{

	@Override
	public void run() {
		int num=4;
		for(int i=0;i<=10;i++) {
			System.out.println(num+"*"+i+"="+num*1);
		}
	}
	
}
	class factor implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			int i;
			int fact=1;
			int number=5;
			for(i=1;i<number;i++) {
				fact=fact*i;
				
			}
			System.out.println("factorial of"+number+"="+fact);

		}
		
	}
public class fibonaciirun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibo1 f=new fibo1();
		Thread t=new Thread(f);
		t.setName("fibonacci thread");
		t.setPriority(1);
		System.out.println("thread name :"+t.getName());
		System.out.println("thread name :"+t.getPriority());
		t.start();

		
		printmulti p=new printmulti();
		Thread t1=new Thread(p);
		t1.setName("multiplication thread");
		t1.setPriority(4);
		System.out.println("thread name :"+t1.getName());
		System.out.println("thread name :"+t1.getPriority());
		t1.start();

	

		factor f1=new factor();
		Thread t2=new Thread(f1);
		t2.setName("fcatorial thred");
		t2.setPriority(5);
		System.out.println("thread name :"+t2.getName());
		System.out.println("thread name :"+t2.getPriority());
		t2.start();

	}
}




