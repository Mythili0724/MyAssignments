package week2.day3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		//FirefoxDriver driver=new FirefoxDriver();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mythili");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("D");
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
	    Select s=new Select(source);
	    s.selectByIndex(2);
	    WebElement source2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
	    Select s1=new Select(source2);
	    s1.selectByIndex(3);
	    driver.findElement(By.name("submitButton")).click();
		

	}

}
