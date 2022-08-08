package corejavaproject;
class counter2{
	static int count=0;

	counter2(){
		count++;
		System.out.println(count);
		
		
		
	}
}

public class counter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		counter2 c1= new counter2();
		counter2 c2= new counter2();
		counter2 c3= new counter2();

		

	}

}
