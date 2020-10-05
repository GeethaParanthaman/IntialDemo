package interview.imp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calender_dateSelection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./src/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("travel_date")).click();
		//driver.findElement(By.cssSelector(""))
		
	;
	while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("November"))
	{
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
	}
		
		
	List<WebElement> datePick=driver.findElements(By.className("day"));
	
		for(int i=1;i<driver.findElements(By.className("day")).size();i++)
		{
			String dateValue=datePick.get(i).getText();
			if(dateValue.contentEquals("23"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}

	}

}
