package week3.day1.ha;

public class RadioButton extends Button{

	public void selectRadioButton()
	{
		System.out.println("Radio button is selected");
	}
	public static void main(String[] args) {
		RadioButton rb= new RadioButton();
		rb.click();
		rb.setText("Radio Button");
		rb.selectRadioButton();
		rb.submit();
	
	}

}
