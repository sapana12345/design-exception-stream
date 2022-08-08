package corejavaproject;
class employee{
	String empname="xyz";
	int emp_id=34;
	
	void accept() {
		System.out.println("enter the employeename:"+empname);
		System.out.println("enter the employee id:"+emp_id);

	}
}
class worker extends employee{
	float salary=20000;
	void accept() {
		System.out.println("enter the worker salary:"+salary);

	}
}
class manager extends employee{
	int manager_id=2;
	void accept() {
		
	
	System.out.println("enter the managerid:"+manager_id);
	}
}
public class employeedetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
employee e1=new employee();
worker w=new worker();
manager m= new manager();
e1.accept();
w.accept();
m.accept();
	}

}
