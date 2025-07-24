package week3.day4_HA;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomatingFrame {

	public static void main(String[] args) {
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("guest");
		//ChromeDriver driver=new ChromeDriver(options);
        //loading the webdriver
		FirefoxDriver driver=new FirefoxDriver();
		//Maximize the browser window
		driver.manage().window().maximize();
		//Load the URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//Adding an implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Entering into iframe
		driver.switchTo().frame("iframeResult");
		//click try it button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert text=driver.switchTo().alert();
	    text.sendKeys("Mythili.D");
	    text.accept();
	    //Getting the text in console
	    WebElement text1 = driver.findElement(By.id("demo"));
		String text2 = text1.getText();
		System.out.println("Please enter the name:" + text2);	
		
	}

}
