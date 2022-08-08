package corejavaproject;

 class student123 {
	String name="sapana";
	String course="xyz";
	
	
	student123(){
		
	}
 
student123(String s, String c){
	name=s;
	course=c;
	System.out.println("name:"+name);
	System.out.println("course:"+course);

	
}
student123(student123  x){
name= x.name;
course=x.course;

	System.out.println("name:"+name);
	System.out.println("course:"+course);

}}
public class student1234 {
	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		student123 s1= new student123(); 
		student123 s2= new student123("sapana","xyz"); 
		student123 s3= new student123(s2); 

	


}}