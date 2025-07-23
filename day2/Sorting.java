package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Sorting {

	public static void main(String[] args) {
		String str[]= {"HCL", "Wipro", "Aspire Systems", "CTS"};
		//converting string array to list
		List<String> inter=new ArrayList<>(Arrays.asList(str));
		//sorting the list
		Collections.sort(inter);
	    System.out.println(inter);
	    //sorting the string by reversing the loop
	    for(int i=inter.size()-1;i>=0;i--)
	    {
	    	System.out.print(inter.get(i)+ " ");
	    }
	}

}
