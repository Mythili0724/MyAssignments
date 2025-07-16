package week2.day2.MA;

public class ReverseOddWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] str = test.split(" ");
		char[] str1=test.toCharArray();
        System.out.println("Reversed String is:");
        for(int k=str1.length-1;k>=0;k--)
        {
        	System.out.print(str1[k]);
        }
		
		for (int i = 0; i < str.length; i++) 
            if(i%2!=0)
            {
            	System.out.println(" "+ "odd index:" + " " + str[i]);
            }
          for(int j = 0; j < str.length; j++) 
        	 if(j%2==0)
        	 {
        		 System.out.println("even index:" + " " + str[j]);	 
        	  
          }
           
          
	}

}
