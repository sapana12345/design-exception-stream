package Exception;

public class simpleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stu


		
//			try {
////				//int data=50/0;
////				String s =null;
////				System.out.println(+s.length());
//
//				String s="abc";
//				//String s1="123";
//
//				
//				int i=Integer.parseInt(s);
//			}
//			catch(Exception e) {
//				System.out.println(e);
//			}finally {
//		
		
		//System.out.println("reset the code");}
	try {
int a[]=new int[5];
a[2]=20;
int d=50/0; 
System.out.println("arry"+a[2]);
System.out.println("arry"+d);}
	catch(ArithmeticException ae) {
		System.out.println(ae);

	}
	
catch(Exception e) {
System.out.println(e);}
	
finally {
//catch(MultipleException e) {
	System.out.println("");

}
	}
	
			
	}




	


