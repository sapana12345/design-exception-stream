package corejavaproject;
import java.util.*;

class student{
	int rollno;
	String name;
	student(String n,int r){
		rollno=r;
		name=n;
		
	}
	void display() {
		System.out.println("rollno:"+rollno);
		
		System.out.println("name:"+name);

	}
}
class studentattends extends student{
	double preentday;
	studentattends(int r,String n, int p ){
		super(n,r);
		preentday=p;
		}
	
			void calculate() {
		double avg=(100*preentday)/180;
		display();
		System.out.println("present day:"+preentday);
		System.out.println("avarage attendance:"+avg);
		


		
	}
	
}
public class student1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentattends s1=new studentattends(2,"sapana",137);
		s1.calculate();
		

	}

}
