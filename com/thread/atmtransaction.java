package com.thread;

public class atmtransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<4;i++) {
			accountholder t=new accountholder();
			t.setName("person"+i);
			t.start();
			
		}

	}

}
class atmcenter{
	static synchronized void useraction() throws InterruptedException{
		System.out.println(Thread.currentThread().getName()+"entered");
		System.out.println("performed transaction");
try {
	Thread.sleep(400);
}catch(InterruptedException e) {
	System.out.println("interrupted exception");

}
System.out.println(Thread.currentThread().getName()+"transaction completed");
System.out.println(Thread.currentThread().getName()+" leaving");
System.out.println(Thread.currentThread().getName()+"entered");
System.out.println("................................................................");

	}
}
class accountholder extends Thread{
	public void run() {
	try {
		atmcenter.useraction();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
}