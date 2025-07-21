package week3.day1.ha;

public class Button extends WebElement{

	public void submit()
	{
		System.out.println("Submitted");
	}
	public static void main(String[] args) {
		Button but=new Button();
		but.click();
		but.setText("Button");
		but.submit();
	}

}
