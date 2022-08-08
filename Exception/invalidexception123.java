package Exception;
class invaidexception1 extends Exception{
	//int productwigth;

public invaidexception1 (String s){
	super(s);
	
}
}

public class invalidexception123 {
	void productCheck(int weight)throws invaidexception1{
		if(weight<100) {
			throw new invaidexception1("product invalid");
		}
	}


	public static void main(String[] args) {
		invalidexception123 u1=new invalidexception123();
		try
		{
		u1.productCheck(40);
		}
		catch(invaidexception1 d) {
			System.out.println("caught the exception");
			System.out.println("ex.getMessage");

		}
		

	}

}
