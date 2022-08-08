package stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class employeeerialization {
	public static void main(String[] args)throws Exception {
		
	
FileOutputStream fi=new FileOutputStream("E://xyz.txt");
ObjectOutputStream obj =new ObjectOutputStream(fi);
employee e=new employee();
e.id=1;
e.name="sapana";
e.city="pune";
obj.writeObject(e);

employee e1=new employee();
e1.id=5;
e1.name="saypanafg";
e1.city="punerr";
obj.writeObject(e1);
employee e2=new employee();
e2.id=5;
e2.name="saypanafg";
e2.city="punerr";
obj.writeObject(e2);
System.out.println("data is saved");

}
	}

