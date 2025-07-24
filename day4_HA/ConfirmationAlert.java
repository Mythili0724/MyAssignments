package week3.day4_HA;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class ConfirmationAlert {
	public static void main(String[] args) throws InterruptedException {
		//ChromeOptions options=new ChromeOptions();
				//options.addArguments("guest");
				//ChromeDriver driver=new ChromeDriver(options);
		        //loading the webdriver
				FirefoxDriver driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("https://leafground.com/alert.xhtml");
				//find the element
				driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
				//switch to alert
				Alert con = driver.switchTo().alert();
				//Display the text in alert box
				String confirm = con.getText();
				System.out.println(confirm);
				Thread.sleep(3000);
				con.accept();
				//con.dismiss();
	}

}
