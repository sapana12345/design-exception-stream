package com.thread;
class book{
	String tilte;
	boolean isCompleted;
	public book(String tilte, boolean isCompleted) {
		super();
		this.tilte = tilte;
		this.isCompleted = isCompleted;
	}
	
public String geTilte() {
	return tilte;
	
}
public String setTitle(String title) {
	return this.tilte=tilte;
	
	
}

public book(boolean isCompleted) {
	super();
	this.isCompleted = isCompleted;
}
}

class bookreader implements Runnable{
	static bookreader book;
 

public bookreader(bookreader book) {
	super();
	this.book = book;
}

public void run() {
	// TODO Auto-generated method stub
	synchronized (book) {
	
	System.out.println(Thread.currentThread().getName()+"is wainting  for the book to be completed:" +book.getTilte());
	try {
		book.wait();
	}
	catch(Exception e) {
		System.out.println(e);
	}
	System.out.println(Thread.currentThread().getName()+"is wainting  for the book to be completed now we can readthe book:");

	}
}

private String getTilte() {
	// TODO Auto-generated method stub
	return null;
}


}
class bookwriter implements Runnable{

	  private static bookwriter book1;
	public bookwriter(bookwriter book1) {
		super();
		this.book1 = book1;
	}
	public void run() {
	
		// TODO Auto-generated method stub
		synchronized (book1) {
			System.out.println("author is writing the book:"+ book1.gettilte());
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			//((Object) book1).setCompleted(true);
			book1.notify();
			System.out.println("author is notify the book:");
book1.notifyAll();
		}
		
	}
	private String gettilte() {
		// TODO Auto-generated method stub
		return null;
	}
}
public class multithread {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book b1= new book("the all java book", false);
	
		//bookreader b2=new bookreader(b2);
		
		//bookwriter b3=new bookwriter();
		

	}

}
