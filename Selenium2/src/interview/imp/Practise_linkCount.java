package interview.imp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practise_linkCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./src/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//1. Get link count available in the screen
		System.out.println("Total links count:"+driver.findElements(By.tagName("a")).size());
		
		//2.Get the link count which are displayed in the footer
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		System.out.println("Footer links count:"+footerdriver.findElements(By.tagName("a")).size());
		
		//3.column wise links count
		WebElement columndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int ColumnLinkCount=columndriver.findElements(By.tagName("a")).size();
       System.out.println("1st column count:"+ColumnLinkCount);
       
       //4.Click on column wise link & open
       for(int i=1;i<ColumnLinkCount;i++)
       {
    	   String linkpress=Keys.chord(Keys.CONTROL,Keys.ENTER);
    	   columndriver.findElements(By.tagName("a")).get(i).sendKeys(linkpress);
    	   Thread.sleep(5000);
    	  
       }
    	   
       //5.To print title for opened windows
       Set<String> windowsNavigation=driver.getWindowHandles();
      Iterator<String> it=windowsNavigation.iterator();
      while(it.hasNext())
      {
    	 
    	  String windowTitle=driver.switchTo().window(it.next()).getTitle();
    	  System.out.println("window title is"+windowTitle);
      }
      }
      
      
    	  
    	   
    	   
	}


