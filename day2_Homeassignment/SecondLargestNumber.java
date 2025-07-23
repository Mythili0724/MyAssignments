package week3.day2_Homeassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		Integer arr[]= {3, 2, 11, 4, 6, 7};
		//converting integer array to list
		List<Integer> inter=new ArrayList<>(Arrays.asList(arr));
		Collections.sort(inter);
		System.out.println(inter);
		//printing the second largest number using get index
		Integer str = inter.get(4);
		System.out.println(str);
	}

}
