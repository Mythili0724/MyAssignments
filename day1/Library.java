package week2.day1;

public class Library {

	   public String addBook(String bookTitle)
		{
			System.out.println("Book added successfully");
			return bookTitle;
		}
	   
	   public void issueBook()
	   {
	   System.out.println("Book issued successfully");
	   }


public static void main(String[] args) {
	
	Library lib=new Library();
	String a = lib.addBook("Secret");
	System.out.println("Book name is:"+a);
	lib.issueBook();
	
}
}