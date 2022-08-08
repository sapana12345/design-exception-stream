package com.thread;

public class garbagecollexample implements Runnable {
private void getMyMethod()throws InterruptedException{
	try {
		System.out.println("hi,i am try");
		throw new NullPointerException();
		
	}
	catch(NullPointerException e) {
		System.out.println("hi,i am catch");

	}
	finally {
		System.out.println("hi,i am finally");

	}
	System.gc();
}
protected void finalize()throws  Throwable{
	System.out.println("i am inside finlize block");
super.finalize();
}

	public void run() {
		// TODO Auto-generated method stub
		try {
			getMyMethod();
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
for(int i=1;i<=3;i++) {
	new Thread(new garbagecollexample()).start();
}
	}

}
