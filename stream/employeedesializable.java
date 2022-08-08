package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class employeedesializable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream  f= new FileInputStream("E://xyz.txt");
		ObjectInputStream os=new ObjectInputStream(f);
		employee e;
		e=  (employee) os.readObject();
		employee e1;
		e1=  (employee) os.readObject();
		employee e2;
		e2=  (employee) os.readObject();
		System.out.println("emloyee data:" +"id:"  +e.id+  "name:"  +e.name+  "city: "  +e.city);

		System.out.println("emloyee data:" +"id:"  +e1.id+  "name:"  +e1.name+  "city: "  +e1.city);
		System.out.println("emloyee data:" +"id:"  +e2.id+  "name:"  +e2.name+  "city: "  +e2.city);

	}

}
