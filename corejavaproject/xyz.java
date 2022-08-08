package corejavaproject;
class teacher{
	int rollno;
	String name;
	static String college="ITS";
	teacher(int rn,String n){
		super();
		
		rollno=rn;
		name=n;
	
	}
	void display() {
		System.out.println( "rollno:"+rollno+  "name:" +name+  "college name:" +college);
		
		
	}
}
public class xyz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		teacher s1= new teacher(10, "sapna:");
		teacher s2= new teacher(11, "wyz:");
		s1.display();
		s2.display();


	}

}
