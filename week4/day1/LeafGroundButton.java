package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LeafGroundButton {

	public static void main(String[] args) {
		//ChromeOptions options=new ChromeOptions();
				//options.addArguments("guest");
				//ChromeDriver driver=new ChromeDriver(options);
		        //loading the webdriver
				FirefoxDriver driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("https://leafground.com/button.xhtml");
				//clicking on click and confirm title button
				driver.findElement(By.xpath("//span[text()='Click']")).click();
				//Verifying the title
				String title = driver.getTitle();
				System.out.println(title);
				//navigating back to previous page
				driver.navigate().to("https://leafground.com/button.xhtml");
				//check the disabled button is disabled
				boolean disable = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
				System.out.println(disable);
				//Getting position  for the submit button
				Point location = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']")).getLocation();
				System.out.println(location);
				//Getting background color of the button
				WebElement background = driver.findElement(By.xpath("//span[text()='Save']"));
				String color = background.getCssValue("background-color");
				System.out.println(color);
				//finding height and width of the button
				WebElement size = driver.findElement(By.xpath("//span[text()='Submit']"));
				Dimension butsize = size.getSize();
				System.out.println(butsize);
				driver.close();
	}

}
