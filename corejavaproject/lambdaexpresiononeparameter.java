package corejavaproject;
interface MyfunctionInterface1{
	int checknumber(int n);
}

//public class lambdaexpresiononeparameter {
//	static void fun( MyfunctionInterface1 t, int p) {
//		t.print(p);
//	}

	public static String main(String[] args) {
		// TODO Auto-generated method stub
		MyfunctionInterface1 msg=(n)->{
			if(n%2==0) {
				System.out.println("number is even");
				return 1;
				
				else 
					System.out.println("number is odd");

				
					//return "number is odd";
			}
		}

}
