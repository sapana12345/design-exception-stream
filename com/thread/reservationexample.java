package com.thread;

class  first{
synchronized public void display(String msg) {
		System.out.println("["+msg);
		System.out.println("]");


//		try{
//			Thread.sleep(1000);
//		
//		}catch(InterruptedException e) {
//			
//		 e.printStackTrace();
//
//		}
	

	}
}

class second  extends Thread{
	String msg;
	first obj;
 second(first fp,String str) {
		obj=fp;
		msg=str;
		
	
		
	}
	public void run() {
		obj.display(msg);
	}
	
}
public class reservationexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
first fnew=new first();
second ss=new second(fnew,"hello");
ss.start();
second ss1=new second(fnew,"welcome");
ss1.start();
second ss2=new second(fnew," to muilti-threading");
ss2.start();

	}

}
