package week3.day1.ha;

public class CheckBoxButton extends Button{
      public void clickCheckButton()
     {
	 System.out.println("Check box button is clicked");
     }
	public static void main(String[] args) {
		CheckBoxButton cbb=new CheckBoxButton();
		cbb.click();
		cbb.setText("CheckBoxButton");
		cbb.clickCheckButton();
	}

}
