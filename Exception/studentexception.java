package Exception;
import java.util.Scanner;
class studentexception1 extends Exception{
	studentexception1(String s){
		super(s);
		
	}
}

public class studentexception {
	//System.out.println("enter name");
String name[]= {"sapna","kamal","ashwini"};

//System.out.println("enter name");

public void takevalueStudenttring(String name)throws studentexception1{
	boolean flag=false;
	//for(String str:name) {
	if(name.equalsIgnoreCase(name) ){
			throw new studentexception1 (" not name exist");

		break;
			
		
	if(flag) {
		
		else {
			//name.add(name[]);
		System.out.println("name exist");



		}
	}}
	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.nextLine();

		studentexception s1=new studentexception();
		try {
			s1.takevalueStudenttring("kamal");
			//s1.takevalueStudenttring("sayali");

		}
		catch(studentexception1 s2) {
			System.out.println(" exception check"+s2);
		}
	}

}
