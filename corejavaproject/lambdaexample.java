package corejavaproject;
interface MyfunctionInterface{
	public String sayhello();

//public static String sayhello1(int a) {
//	return null;	
//}
//	
}

public class lambdaexample {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyfunctionInterface msg=()->
		{
			return "hello";
		};
		System.out.println(msg.sayhello());
		//.out.println(MyfunctionInterface.sayhello1(2));

	}

}
