package week4.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		Set<String> leaset=new LinkedHashSet<String>();
		//Set<String> leaset=new HashSet<String>();
		//Set<String> leaset=new TreeSet<String>();
		leaset.add("Mythili");
		leaset.add("velvizhi");
		leaset.add("D");
		leaset.add("Dhaswanth");
		leaset.add("Dhaswanth");
		System.out.println(leaset);
		int size=leaset.size();
		System.out.println(size);
		//boolean size2=leaset.remove("Dhaswanth");
		leaset.remove("D");
		leaset.add("Deva");
		System.out.println(leaset);
		List<String> lis= new ArrayList<String>(leaset);
		System.out.println(lis);
		String str= lis.get(1);
		System.out.println(str);
		
		

	}

}
