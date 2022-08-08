package corejavaproject;

public class simpleexception {


//
public static void main(String[] args) {
try {
	//int data=50/0;
	String s =null;
	System.out.println(+s.length());

}
catch(NullPointerException e) {
	System.out.println(e);
}finally {
	System.out.println("reset the code");}

}
}

