package corejavaproject;

public class xyz12 {

	public static void main(String[] args) {
		int intvar1=20;
		
int intvar2=25;
double doublevar1=2.5;
double doublevar2=3.7;
int result1= xyz123.minFunction(intvar1,intvar2);
double result2=xyz123.minFunction(doublevar1,doublevar2);
System.out.println("the minimum value of interger type="+result1);
System.out.println("the minimum value of double type="+result2);

	}
}
 class xyz123{
		
	
public static int minFunction(int n1,int n2) {
	int min;
	if(n1>n2)
		min=n2;
	else min=n1;
	return min;
	
}
public static double minFunction(double n1,double n2) {
	double min;
	if(n1>n2)
		min=n2;
	else 
		min=n1;
	return min;
}
}


