package com.thread;

public class finalizedexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finalizedexample obj=new finalizedexample();
		obj=null;
		//System.out.println(obj.hashCode());
String string =new String("hellow");
	string=null;
System.gc();
	System.out.println("end garbege collection");
	
	}
protected void finalize() {
	System.out.println("finalized method callled");

}
}
