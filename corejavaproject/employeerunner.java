package corejavaproject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class employeerunner {
public static List<employeeru>getEmployeeru(){
	List<employeeru>emp=new ArrayList<employeeru>();
	emp.add(new employeeru(11,"sapana",20000));
	emp.add(new employeeru(12,"ashwini",30000));
	emp.add(new employeeru(13,"pooja",50000));
	emp.add(new employeeru(14,"kajal",40000));

	return emp;
	
}
	public static void main(String[] args) {
Predicate<employeeru>e1=e->e.name.startsWith("p")&&e.salory>50000;
//Predicate<employeeru>e2=e->e.salory>50000;								
//using any match method
List<employeeru>l=getEmployeeru();
boolean b=l.stream().anyMatch(e1);
System.out.println("any macth"+b);


//using none match method
Predicate<employeeru>e2=e->e.salory<30000;
boolean b1=l.stream().noneMatch(e2);
System.out.println("none match result: "+b1);

//using allmatch method

Predicate<employeeru>e3=e->e.salory>20000;
boolean b2=l.stream().allMatch(e3);
System.out.println("all match result: "+b2);

	}

}
