package stream;

import java.io.*;

public class rademo extends Exception{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw= new FileWriter("E://laptop.txt");
			fw.write("welcome");
			fw.close();
			//.out.println( fw.readChar());

		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("success");

	}

}
