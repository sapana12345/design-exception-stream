package design.java;
interface car {
	public void assemple();
}

class baisccar implements car{
	
	public void assemple() {
		System.out.println("basic car");
	}

}
 class cardecorator implements car{
protected car c;
	
	public cardecorator(car c) {
	super();
	this.c = c;
}

	{
		
	}

	@Override
	public void assemple() {
this.c.assemple();		
	}
	
}
 class sportcar extends cardecorator{

	public sportcar(car c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	public void assemple() {
		super.assemple();	
		System.out.println("adding of fetures of sport car");

			}
			
	 
 }
 class luxurycar extends cardecorator{

		public luxurycar(car c) {
			super(c);
			// TODO Auto-generated constructor stub
		}
		public void assemple() {
			super.assemple();	
			System.out.println("adding of fetures of luxury car");

				}
 }
				
public class decoraterexample {

	public static void main(String[] args) {
car sportcar=new sportcar(new baisccar());
sportcar.assemple();
car sportcar12=new sportcar(new luxurycar (new baisccar()));
sportcar12.assemple();
	}

}
