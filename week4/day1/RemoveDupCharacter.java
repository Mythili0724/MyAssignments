package week4.day1;
import java.util.LinkedHashSet;
import java.util.Set;
public class RemoveDupCharacter {

			public static void main(String[] args) {
				String str="google";
				char[] ch = str.toCharArray();
				System.out.println(ch.length);
				Set<Character> leaset=new LinkedHashSet<Character>();
				 for(int i=0;i<ch.length;i++)
				 {
					 leaset.add(ch[i]);
					 //System.out.println(leaset);
				 }
				 System.out.println(leaset);

	}

}
