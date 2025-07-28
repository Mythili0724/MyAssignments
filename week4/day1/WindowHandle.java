package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException  {
		  ChromeOptions options=new ChromeOptions();
          options.addArguments("guest");
		  ChromeDriver driver=new ChromeDriver(options);
		//FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.irctc.co.in/");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.linkText("FLIGHTS")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("(//a[text()=' FLIGHTS '])[1]")).click();
		String parentWin=driver.getWindowHandle();
		System.out.println(parentWin);
	    Set<String> childWin=driver.getWindowHandles();
	    List<String> address=new ArrayList<String>(childWin);
	    System.out.println(address.get(0));
	    System.out.println(address.get(1));
	    driver.switchTo().window(address.get(1));
	    String titleOfParent= driver.getTitle();
	    System.out.println(titleOfParent);
	    driver.switchTo().window(address.get(0));
	    String titleOfChild= driver.getTitle();
	    System.out.println(titleOfChild);
	    driver.close();

	  
	}

}
