package design.java;

 class chef{
	public void cookpasta() {
		System.out.println("chef is cooking chiken alfredo");
	}
	public void bakecake() {
		System.out.println("chef is baking chocolate fuge cake");

	}
}
 interface command{
	 public abstract void excute();
 }
 class order implements command{
private chef chef;
private String food;
	@Override
	public void excute() {
if(this.food.equals("pasta")) {
	this.chef.cookpasta();
}else {
	this.chef.bakecake();
}}
	
public order(chef chef, String food) {
	super();
	this.chef = chef;
	this.food = food;
}
	 
 }
 class waiter{
	 private order oreder;

	public waiter(order oreder) {
		super();
		this.oreder = oreder;
	}
	public void excute() {
		this.oreder.excute();
	}
 }
 
public class beheviroalexample {

	public static void main(String[] args) {
chef c=new chef();
order o=new order(c,"pasta");
waiter w=new waiter(o);
order c1 =new order(c,"cake");
waiter w1=new waiter(o);
w.excute();

	}

}

