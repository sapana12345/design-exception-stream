package corejavaproject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class foreachexample {

	//List<String>al=new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>al=new ArrayList<>();
al.add("xyz");
al.add("abcwrd");
int count = 0;
for(String str:al) {
	if(str.length()<6)
	count++;
}
long count1;

	//Collection<String> names ;
	count1 = al.stream().filter(str->str.length()<6).count();


System.out.println("there are "          +count1+      "string with length less than 6");
	}

}
