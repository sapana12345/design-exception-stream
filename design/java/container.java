package design.java;
interface iterative{
	public  boolean hashNext(); 
	public Object next();
	//public iterative getIterative();
	
}
public interface container {
	//public  void geIterator();
		public iterative getIterative();
}

class namerepository implements container{
private String name[]= {"sapna","sanika","kamal"};

	public iterative getIterative() {
		// TODO Auto-generated method stub
	System.out.println("sapana bodake");

		return new 	nameiterator();
		
	}
class nameiterator implements iterative{

		//@Override
		int  index;
		public boolean hashNext() {
			//Object name;
			if(index<name.length) {
				return true;
			}
			return false;
		}
//@Overri
public Object next() {
			if(this.hashNext()) {
				return name[index++];
			}
			return null;
}
		}
	


 public class iterativeexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		namerepository s=new namerepository();
		for(iterative i=s.getIterative();i.hashNext();) {
			String name=(String)i.next();
			System.out.println("name: "+name);

		}
		//s.getIterative();
	}

}
}
