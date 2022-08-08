package corejavaproject;

  class CollegeData{
public 	void collegedata() {
		System.out.println("enter college department:4");
	}

}
 interface  hostelData{
	 void hostData() {
		System.out.println("number of student in hostel:500");

	}
}
class StuRecord1 extends CollegeData implements hostelData{
	public static void main(String args[]) {
		StuRecord1 sr=new StuRecord1();
		//hostelData hd = new hostelData();
		
		sr.collegedata();
		sr.hostData();
		
		
		
	}
}
