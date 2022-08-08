package corejavaproject;
abstract class mydemo{
	abstract void calculate(double x);
}
class Square extends mydemo{
	void calculate (double x) {
		System.out.println("sauare="+(x*x));
		
	}
	
}
class squareroot extends mydemo{
	void calculate(double x) {
		System.out.println("sauare="+Math.sqrt(x));

	}
}
public class abstractdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s1= new Square();
s1.calculate(4);
squareroot s2= new squareroot();
s2.calculate(4);
mydemo reference;
reference=s1;
s1.calculate(5);
reference=s2;
s2.calculate(5);




	}

}
