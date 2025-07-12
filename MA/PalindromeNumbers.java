package week1.day2.MA;

import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class PalindromeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num;
		num=sc.nextInt();
		
		//int num2=num;
		int rev=0;
		while(num!=0)
		{
		    rev=rev*10 +num%10;
			num=num/10;
		}
		System.out.println(rev);

	}

}
