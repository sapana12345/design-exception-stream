package design.java;
 abstract class beverage{
	private String description;

	public beverage(String description) {
		super();
		this.description = description;
	}
	
	public String getdescription() {
		return description;
	}
	public abstract double cost();
}
 class houseblend extends beverage{

	public houseblend() {
		super("house blend");
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 250;
	}
	
}
 class darkroast extends beverage{

	public darkroast() {
		super("dark roast");
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 300;
	}
	 
 } 
 abstract class Addon extends beverage{

	protected beverage beverage;
	private Object bev;

	public Addon(String description, beverage bev) {
		super(description);
		this.beverage=bev;
	}
	public abstract String getdescription();
	 
 }
  class sugar extends Addon{
	 

	public sugar(beverage bev) {
		super("sugar",bev);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getdescription() {
		// TODO Auto-generated method stub
		return beverage.getdescription()+"milk movha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+ 50;
	}
 }
 class milk extends Addon{

	public milk(beverage bev) {
		super("milk", bev);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getdescription() {
		// TODO Auto-generated method stub
		return beverage.getdescription()+"with milk";

	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+ 100;


	}
	 
 }
public class designexample {

	public static void main(String[] args) {
houseblend h1=new houseblend();
System.out.println(h1.getdescription()+":"+h1.cost());
milk m1=new milk(h1);
System.out.println(m1.getdescription()+":"+m1.cost());
sugar s1=new sugar(m1);
System.out.println(s1.getdescription()+":"+s1.cost());


	}

}
