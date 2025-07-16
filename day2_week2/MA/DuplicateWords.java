package week2.day2.MA;

public class DuplicateWords {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		int count=0;
		for(int i=0;i<split.length;i++) {
			if (split[i].equalsIgnoreCase("")) 
				continue; 
			for(int j=i+1;j<split.length;j++)
			{
				if(split[i].equalsIgnoreCase(split[j]))
				{
					split[i]=" ";
					count++;
				}
			}
		}
			if(count>0)
			{
				System.out.println("Duplicate words");	
			for(String splits: split)
			{
			if(!splits.equalsIgnoreCase(""))
			{
				System.out.print(splits+ " ");
			}
			}
			}
			else
			{
				System.out.print("No duplicates found");
			}
	}
}

				
			
			
	
	
	

	


