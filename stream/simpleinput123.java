package stream;

import java.io.BufferedReader;
import java.io.FileReader;

public class simpleinput123 {

		public static void main(String[] args, Object wordcnt) throws Exception {
			// TODO Auto-generated method stub
//			
		FileReader ins=new FileReader("E://xyz.txt");
		BufferedReader br=new BufferedReader(ins);
		String currentLine=br.readLine();
		int linecount=0;
		 int wordcnt1 = 0;
		 int chcount=0;
		 
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
		//System.out.println("number of  char:"+chcount);
		System.out.println("number of  word:"+wordcnt1);
		System.out.println("number of  char:"+chcount);

	br.close();
		}
		}

