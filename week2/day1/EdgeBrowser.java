package week2.day1;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser val=new Browser();
		String str=val.launchBrowser("Chrome");
		System.out.println(str);
		val.loadUrl();

	}

}
