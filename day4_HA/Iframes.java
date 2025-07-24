package week3.day4_HA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		//FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/frame.xhtml");
		driver.switchTo().frame(2);
		//driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.xpath("//iframe[@name='frame2']"));
		driver.switchTo().frame(ele);
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='Click']"));
	}

}
