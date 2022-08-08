package corejavaproject;

public class Myclass {
int x;

	public Myclass(int i) {
		// TODO Auto-generated constructor stub
		x=i;
		//System.out.println("print x:"+x);
	}

public class condemo{
public static void main(String args[])
{
	Myclass ms1= new Myclass(10);
	Myclass ms2= new Myclass(20);
	
	System.out.println(ms1.x+""+ms2.x);

	}
}
}
