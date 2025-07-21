package week3.day1.ha;

public class LoginTestData extends TestData {
	public void enterUsername(String name)
	{
		System.out.println("Username is:" + " " + name);
	}
	public void enterPassword(String pass)
	{
		System.out.println("Password is:"+ " " + pass);
	}
	public static void main(String[] args) {
		LoginTestData ltd=new LoginTestData();
		ltd.enterCredentials();
		ltd.enterUsername("Mythili.D");
		ltd.enterPassword("12345");
		ltd.navigateToHomePage();

	}

}
