package week2.day3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Mythili");
		driver.findElement(By.name("lastname")).sendKeys("D");
		driver.findElement(By.name("reg_email__")).sendKeys("mythilidayalan@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Mythili@07");
		WebElement day = driver.findElement(By.id("day"));
		Select sel=new Select(day);
		sel.selectByIndex(6);
		
		WebElement month=driver.findElement(By.id("month"));
		Select sel1=new Select(month);
		sel1.selectByIndex(11);
		
		WebElement year=driver.findElement(By.id("year"));
		Select sel2=new Select(year);
		sel2.selectByValue("1990");
		
		driver.findElement(By.className("_58mt")).click();
		
		
	}
}
