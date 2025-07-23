package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MobilePhone {

	public static void main(String[] args) {
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("guest");
		//ChromeDriver driver=new ChromeDriver(options);
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.amazon.in");
	    WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	    search.sendKeys("mobile phones");
	    search.sendKeys(Keys.RETURN);
	    List<WebElement> search2 = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	    List<Integer> num= new ArrayList<Integer>();
	    for (int i=0;i<search2.size();i++)
	    {
	    	String phoneprize=search2.get(i).getText();
	    	if(!phoneprize.isEmpty()) 
	    	{
	        int rate=Integer.parseInt(phoneprize);
	        num.add(rate);
	    	}
	    }
	    //Collections.sort(num);
	    System.out.println(num);
	  
	}

 }
 
