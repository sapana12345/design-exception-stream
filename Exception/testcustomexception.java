package Exception;

public class testcustomexception {
	

	 static void validate(int age) throws invalidageexception {

	if(age<18) 
		throw  new invalidageexception("hellow ");
		else
			System.out.println("welcome to jvaa");
	}


	


	





	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	validate(13);
	
}
catch(Exception e) {
	System.out.println("exception occured");
	System.out.println("rest the code");


}
	}

}
