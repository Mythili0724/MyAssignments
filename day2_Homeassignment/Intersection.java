package week3.day2_Homeassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
		Integer arr[]= {3, 2, 11, 4, 6, 7};
		Integer arr2[]={1, 2, 8, 4, 9, 7};
		////converting integer array to list
		List<Integer> inter=new ArrayList<>(Arrays.asList(arr));
		List<Integer> inter2=new ArrayList<>(Arrays.asList(arr2));
		//printing the list value
		System.out.println(inter);
		System.out.println(inter2);
		//iterating in loop to get the repeated value
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
				if (arr[i]==(arr2[j]))
				{
					System.out.println(arr[i]);
				}
		}
		
		
		

	}

}
