package week2.day1;

public class Browser {
	
	public String launchBrowser( String browserName)
	{
	System.out.println("Browser launched successfully");
	return browserName;
	}

	public void loadUrl()
	{
		System.out.println("Application url loaded successfully");
	}
	public static void main(String[] args) {
		
		Browser val=new Browser();
		String str=val.launchBrowser("Chrome");
		System.out.println(str);
		val.loadUrl();
		
	}

}