package week2.day2.MA;

public class FindOccurences {

	public static void main(String[] args) {
		String input="TestLeaf";
		char target='e';
		int count=0;
		char[] ch = input.toCharArray();
		System.out.println(ch.length);
		for(int i=0;i<ch.length;i++)
			if(ch[i]==target)
			{
				count++;
			}
		
		System.out.println("Character 'e' occured:" + count + "times");
		                  
	}
}

