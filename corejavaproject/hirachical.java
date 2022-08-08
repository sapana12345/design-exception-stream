package corejavaproject;
class car{
	void carmodel() {
		System.out.println("enter the car info:");
		}
}
class maruti extends car{
	void marutiinfo() {
		System.out.println("calss maruti");
		
	}
}
class honda extends car{
	void hondainfo() {
		System.out.println("class honda");
		
	}
}
public class hirachical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
car c=new car();
maruti m=new maruti();
honda h=new honda();
c.carmodel();
m.marutiinfo();
h.hondainfo();
	}
	

}
