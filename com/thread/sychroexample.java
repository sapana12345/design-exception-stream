package com.thread;
class myTable1 extends Thread{
	int num=0;

	public myTable1(int num) {
		super();
		this.num = num;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		createTbale(num);
		
		
	}
//	private void createTable(int num2) {
//		// TODO Auto-generated method stub
//		
//	}
	public void createTbale(int number) {
		for(int i=1;i<=number;i++) {
			System.out .println(number+ " *"+i+"="+(number*i));
			
		}
	}
}
	class facto12 extends Thread{
		int factnumber=0;

		public facto12(int factnumber) {
			super();
			this.factnumber = factnumber;
		}
		public void run() {
			int j=findFacto(factnumber);
			System.out .println("factorial is: "+j);

			
		}
		synchronized public int  findFacto(int number) {
			int i;int fact = 1;
			for(i=1;i<=number;i++) {
				//return fact;
			}
			return fact;
			
		}
	}
class fibo12 extends Thread{
int fibo;
		public fibo12(int fibo) {
	super();
	this.fibo = fibo;
}
		@Override
		public void run() {
			//int fibo= findFio12(int fibo);
			try {
				Thread.sleep(30);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
       synchronized public void printFibo() {
			//System.out.println("fibonacii number");
		
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
public class sychroexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
myTable1 t=new myTable1(5);
t.start();
facto12 f1=new facto12(3);
f1.start();
fibo12 f2=new fibo12(12);
f2.start();

	}

}
