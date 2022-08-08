package design.java;

//import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
//import java.util.concurrent.Callable;

 abstract class color implements Cloneable{
	protected  String colorname;
	abstract void  addClor();
	public Object clone() {
		Object clone=null;
		try {
			clone=super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clone;
		
	}

}

class bluecolor extends color{

public bluecolor() 
{
	this.colorname= "blue";
	
}
	@Override
	void addClor() {
		// TODO Auto-generated method stub
		System.out.println("bluecolor added");
	}
	
}
class blackcolor extends color{

public blackcolor() 
{
	this.colorname= "pink";
	
}
	@Override
	void addClor() {
		// TODO Auto-generated method stub
		System.out.println("bluecolor added");
	}
	
}
class colorstore{
	private static Map<String,color>colorMap=new HashMap<String ,color>();
	static {
		colorMap.put("blue", new bluecolor());
		colorMap.put("black", new blackcolor());

	}
	
	 public static color getColor(String colorname) {
		return(color)colorMap.get(colorname).clone();

	}
}

public class protypeexample {

	public static void main(String[] args) {
	colorstore.getColor("blue").addClor();
	colorstore.getColor("black").addClor();
	colorstore.getColor("black").addClor();
	colorstore.getColor("blue").addClor();

	}

}
