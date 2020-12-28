package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestiveDropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./src/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
	WebElement source=driver.findElement(By.id("fromCity"));
	source.sendKeys(Keys.ENTER);
	source.sendKeys("mum");
	Thread.sleep(3000);
	source.sendKeys(Keys.ARROW_DOWN);
	WebElement destination=driver.findElement(By.id("toCity"));
	destination.sendKeys(Keys.ENTER);
	destination.sendKeys("del");
	Thread.sleep(3000);
	for(int i=1;i<3;i++) {
	destination.sendKeys(Keys.ARROW_DOWN);
	
	}
	destination.sendKeys(Keys.ENTER);
	
	}

}
