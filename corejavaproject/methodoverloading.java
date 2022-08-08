package corejavaproject;

public class methodoverloading {
void sum(int a ,int b)
{
	System.out.println(a+b);
	
	}
void sum(int a,int b,int c) {
	System.out.println(a+b+c);

	
}
void add(int a,float b)
{
	System.out.println("sum"+(a+b));
	
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverloading mo = new methodoverloading();
		
mo.sum(10,20,30);
mo.sum(10, 50);
mo.add(30 69.9);
	}

}
