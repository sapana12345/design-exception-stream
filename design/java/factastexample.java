package design.java;

//import design.java.renault.facadecar;

interface carmodel{
	public  void build();
		
	
}
class chevrolet implements carmodel{

	
	public void build() {
System.out.println("adding the model cherolet");		
	}
	
}
class bmw implements carmodel{

	@Override
	public void build() {
		System.out.println("adding the model cherolet");		
		
	}
	
}
class renault implements carmodel{

	@Override
	public void build() {
		// TODO Auto-generated method stub
		System.out.println("adding the model cherolet");		

	}
}
class facadecar{
		private carmodel cherolet,bmw,renault;
		public facadecar() {
			super();
			this.cherolet=new chevrolet();
			this.bmw=new bmw();
			this.renault=new renault();
		}
		public void buildbmw() {
			bmw.build();
		}
		public void buildcherloet() {
		cherolet.build();
		}
		public void buildrenault() {
			renault.build();
		}
	}

	

public class factastexample {

	public static void main(String[] args) {
		facadecar f=new facadecar();
		
f.buildbmw();
f.buildcherloet();
f.buildrenault();
	}
	

}
