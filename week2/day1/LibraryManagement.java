package week2.day1;

public class LibraryManagement {

	public static void main(String[] args) {
		Library lib=new Library();
		String a = lib.addBook("Harry Potter");
		System.out.println("Book name is:"+a);
		lib.issueBook();
		
	}

}
