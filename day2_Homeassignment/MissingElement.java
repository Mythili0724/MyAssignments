package week3.day2_Homeassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		Integer arr[]={1, 2, 3, 4, 10, 6, 8};
		//Assigning array to list
		List<Integer> inter=new ArrayList<>(Arrays.asList(arr));
		// sorting the list
		Collections.sort(inter);
		System.out.println(inter);
		for (int i=0;i<inter.size()-1;i++)
		{
				int a=inter.get(i);
				int b=inter.get(i+1);
				//Condition checks if there is a gap 
			if(a!=b)
		{
			System.out.println("Gap detected:"+ a+ " "+b);
		}
			else
			{
				System.out.println("Gap  not detected:");
			}
		}
		
	
	}

}
