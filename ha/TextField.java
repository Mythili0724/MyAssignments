package week3.day1.ha;

public class TextField extends WebElement{

	public void getText()
	{
		System.out.println("Print the text");
	}
	public static void main(String[] args) {
		TextField tf= new TextField();
		tf.click();
		tf.setText("TextField");
		tf.getText();
	}

}
