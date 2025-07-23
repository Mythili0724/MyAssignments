package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateSet {

	public static void main(String[] args) {
		int[] num= {2,3,5,3,7,5,9};
		Set<Integer> leaset=new LinkedHashSet<Integer>();
		 for(int i=0;i<num.length;i++)
		 {
			 leaset.add(num[i]);
			 //System.out.println(leaset);
		 }
		 System.out.println(leaset);
	}

}
