package design.java;
class sapana{
	private static sapana spobject;//singloton object
	public String s;
	private sapana() {//singleton constructor
		s="hello i am a string part of singleton";
	}
	public static sapana getInstance() {
		if(spobject==null) {
			spobject=new sapana();
		}
		return spobject;//return singleton object
		
	}
	public void getConnection() {
 simple prog--------------------		
	}
}
public class singletonmoreexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sapana sp;
sp=sapana.getInstance();
sp=sapana.getInstance();
sp=sapana.getInstance();

sp.getConnection();
	}

}
