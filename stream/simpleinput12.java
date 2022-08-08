package stream;
import java.io.*;
//import java.util.*;;
public class simpleinput12 {

	public static void main(String[] args, Object wordcnt) throws Exception {
		// TODO Auto-generated method stub
//		
	FileReader ins=new FileReader("E://xyz.txt");
	BufferedReader br=new BufferedReader(ins);
	String currentLine=br.readLine();
	int linecount=0;
	 int wordcnt1 = 0;
	 int chcount=0;
	 //String words;
	//Object currentLine = null;
//	while(currentLine!=null) {
//	linecount++;
//	currentLine=br.readLine();
//	//System.out.println("count line");
//	
//	}
	while(currentLine!=null) {
		linecount++;
	String[] words=currentLine.split(" ");
	wordcnt1=wordcnt1 + words.length;
	currentLine=br.readLine();
	
		//System.out.println("count line");*
	
	for(String word:words) {
		chcount =chcount+word.length();
	}
		currentLine=br.readLine();
	}
	
	System.out.println("number of  line:"+linecount);
	System.out.println("number of  char:"+chcount);
	System.out.println("number of  word:"+wordcnt1);
br.close();
	}
	}
	
	
	
