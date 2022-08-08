package stream;

import java.io.*;
//import java.io.InputStream;

public class readdemo extends Exception{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//try {
			
		
		FileWriter fr=new FileWriter("E://xyz.txt");
		
		InputStream  f= new FileInputStream("E://xyz.txt");
		//OutputStream  fs= new FileOutputStream("E://laptop.txt");

		int i;
		int size;
		//int[] size1= {45,67,67};
		System.out.print("bytes available to read:"+(size=f.available()));
		char str[]=new char[200];
		
		//while((i=f.read())!=-1)
		for(i=0;i<size;i++) {
			str[i]=((char)f.read());
			
		
			
System.out.print((str)[i]);
		}
		System.out.print("");

		
		f.close();
		
	}
//catch(Exception e)
		//{
	//System.out.println(e);

		//}
	}
//}


