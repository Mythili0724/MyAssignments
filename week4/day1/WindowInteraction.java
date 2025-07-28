package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowInteraction {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Clicking contacts button
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		//clicking Merging contacts 
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//a[contains(@href,'ComboBox_partyIdFrom')]")).click();
		//Handling different windows
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> child = driver.getWindowHandles();
		List<String> address=new ArrayList<String>(child);
		String add1 = address.get(0);
		System.out.println(add1);
		String titleofParent = driver.getTitle();
		System.out.println(titleofParent);
		//switching to child window
		driver.switchTo().window(address.get(1));
		String titleofChild = driver.getTitle();
		System.out.println(titleofChild);
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement until1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[contains(@href,'DemoCustomer')])[1]")));
		until1.click();
		//driver.findElement(By.xpath("(//a[contains(@href,'DemoCustomer')])[1]")).click();
		driver.switchTo().window(address.get(0));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[contains(@href,'ComboBox_partyIdTo')]")).click();
		String parent1 = driver.getWindowHandle();
		System.out.println(parent1);
		Set<String> child1 = driver.getWindowHandles();
		List<String> address1=new ArrayList<String>(child1);
		//switching to child window
		driver.switchTo().window(address1.get(1));
		String titleofChild1 = driver.getTitle();
		System.out.println(titleofChild1);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement until = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[contains(@href,'DemoPrivilegedCust')])[1]")));
		until.click();
		//switching driver focus
		driver.switchTo().window(address1.get(0));
		//clicking on merge button
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		//handling alert
		Alert alt = driver.switchTo().alert();
		String str = alt.getText();
		System.out.println(str);
		alt.accept();
	    driver.close();
		
	}

}
