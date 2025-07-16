package week2.day2.MA;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		int str = text1.length();
		int str2= text2.length();
		System.out.println(str+ " "+str2);
		if(str==str2)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
		
		char[] ch=text1.toCharArray();
		char[] ch1=text2.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		System.out.println(ch);
		System.out.println(ch1);
		if(Arrays.equals(ch,ch1))
	   {
		   System.out.println("The given strings are Anagram");
	   }
	   else
	   {
		   System.out.println("The given strings are not an Anagram"); 
	   }

	}

}
