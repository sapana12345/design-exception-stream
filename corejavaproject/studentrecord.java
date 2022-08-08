package corejavaproject;
public class studentrecord implements collegedata1,hosteldata {
//class collegeImpl1 implements collegedata1{
	//public void collegeDetail() {
		//System.out.println("enter the  in college name :SPV");
	//}

//public void studentData() {
////	System.out.println("enter the student name:sapana");
	//System.out.println("enter the student rollno:20");

//}

//@Override
///public void hostelDetails() {
	// TODO Auto-generated method stub
	
////}

//@Override
///public void studentRecord() {
	// TODO Auto-generated method stub
	//}
//}
//class hostelImpl1 implements hosteldata{
	//public void hostelDetails() {
		//System.out.println("enter the hosetl name:smp");
		//}
	
	
		//public void studentRecord() {
			////System.out.println("enter the student recor:300");

		//}

	@Override
	///public void hostelDetails() {
		// TODO Auto-generated method stub
		///System.out.println("enter the hostel name:smp");

		
	//}

		
		

	//}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		collegeImpl1 cp= new collegeImpl1();
		cp.collegeDetail();
		cp.studentData();
		hostelImpl1 hp= new hostelImpl1();
		hp.hostelDetail();
		hp.studentRecord();

	}

}
