package week2.day2;

public class StringClass {

	public static void main(java.lang.String[] args) {
	String str="TestLeaf";
	char[] ch=str.toCharArray();
	System.out.println(ch);
	for(int i=7;i>=0;i--)
	{
		System.out.print(ch[i]);
	}
	}
}