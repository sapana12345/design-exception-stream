package corejavaproject;
//import java.util.*;

class person{
	int age;
	String name,city;
	person(int a,String n,String c){
		age=a;
		name=n;
		city=c;
		
	}
	void display() {
		System.out.println("Age:"+age);
		System.out.println("Name:"+name);		
		System.out.println("City:"+city);
		


	}
	
}
class personlearners extends person{
	
	String Course;
	personlearners(int a, String n,String c,String cs)
	{
		super(a,n,c);
Course=cs;


	}
	void display1() {
		display();
		System.out.println("course:"+Course);

	}
	
}
public class persons1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		personlearners pl=new personlearners(20,"sapana","mumbai","computer");
		pl.display1();
		//p1.put();
		

	}

}
