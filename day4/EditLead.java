package week2.day4;

import java.time.Duration;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EditLead {

	public static void main(String[] args) {
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://leaftaps.com/opentaps/control/main");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		d.findElement(By.xpath("//input[@id='username']")).sendKeys("democsr");
		d.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		d.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		d.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		d.findElement(By.xpath("//a[text()='Leads']")).click();
		d.findElement(By.xpath("//a[text()='Create Lead']")).click();
		d.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		d.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Mythili");
		d.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("D");
		d.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Mythili");
		d.findElement(By.id("createLeadForm_departmentName")).sendKeys("Btech");
		d.findElement(By.id("createLeadForm_description")).sendKeys("Test");
		d.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mythilidayalan@gmail.com");
		WebElement state = d.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sel=new Select(state);
		sel.selectByVisibleText("New York");
		d.findElement(By.name("submitButton")).click();
		d.findElement(By.xpath("//a[text()='Edit']")).click();
		d.findElement(By.id("updateLeadForm_description")).clear();
		d.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Test Lead");
		d.findElement(By.xpath("//input[@name='submitButton']")).click();
		String title = d.getTitle();
		System.out.println(title);
		d.close();
	}

}
