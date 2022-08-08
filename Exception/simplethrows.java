package Exception;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
class xyz1234{
	

 static void validate(int age) {

if(age<18) 
	throw new ArithmeticException("not valid");
	else
		System.out.println("welcome to jvaa");
}
 }


public class simplethrows {
	

	public static void main(String[] args)  {
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("enter name");
//		String Name=br.readLine();
//		System.out.println("enter name"+Name);
//		System.out.println("enter rollnumber");
//
//		int rollno=Integer.parseInt(br.readLine());
//		
//		System.out.println("enter rollno"+rollno);
xyz1234.validate(30);

		System.out.println("valid");

		
}

	}


