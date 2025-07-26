package marathon;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https:\\www.amazon.in");
	    WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	    search.sendKeys("Bags for boys");
	    search.sendKeys(Keys.RETURN);
	    //choose for items in the result
	    List<WebElement> bags = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
	    System.out.println(bags.size());
	    WebElement text = driver.findElement(By.xpath("//span[contains(text(),'results for')]"));
	    String str = text.getText();
	    System.out.println(str + " Bags for boys");
	    //Selecting two brands in the left menu
	    WebElement checkbox = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[7]"));
	    checkbox.click();
	    /*if (!checkbox.isSelected()) {
	    	checkbox.click();
	    }*/
	    WebElement checkbox1 = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[5]"));
	    if (!checkbox1.isSelected()) {
	    	checkbox1.click();
	    }
	    //Click for new arrivals
	    driver.findElement(By.id("a-autoid-0-announce")).click();
	    driver.findElement(By.className("a-dropdown-prompt")).click();
	    Thread.sleep(5000);
	    WebElement newestArrivals = driver.findElement(By.xpath("//a[contains(text(),'Newest Arrivals')]"));
        newestArrivals.click();
        Thread.sleep(5000);
        //Printing first resulting bag info
        WebElement name = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base'])[1]"));
        System.out.println(name.getText()); 
        WebElement price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
        System.out.println(price.getText());
        //Gettitle of the page
        driver.getTitle();
        Thread.sleep(5000);
        driver.close();
	    

	}
}