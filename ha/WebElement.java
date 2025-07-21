package week3.day1.ha;

public class WebElement {
	public void click()
	{
		System.out.println("Click the element");
	}
	public void setText(String Text)
	{
		System.out.println("Text is:" +Text);
	}

	public static void main(String[] args) {
		WebElement we=new WebElement();
		we.click();
		we.setText("Inheritance");

	}

}
