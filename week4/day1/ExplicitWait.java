package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
        options.addArguments("guest");
		  ChromeDriver driver=new ChromeDriver(options);
		//FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/window.xhtml");
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		WebDriverWait wait= new WebDriverWait(driver ,Duration.ofSeconds(10));
		System.out.println(wait.until(ExpectedConditions.numberOfWindowsToBe(3)));
		
	}

}
