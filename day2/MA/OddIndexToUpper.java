package week2.day2.MA;

public class OddIndexToUpper {

	public static void main(String[] args) {
		String test="changeme";
		int i;
		char ch[]=test.toCharArray();
		System.out.println(ch);
		for(i=0;i<=ch.length-1;i++)
		{
			if(i%2!=0)
			{
				ch[i] = Character.toUpperCase(ch[i]);
				
				}
			System.out.print(ch[i]);
				
		}
		
		}
	
}
