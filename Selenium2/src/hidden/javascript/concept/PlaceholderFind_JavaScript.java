package hidden.javascript.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PlaceholderFind_JavaScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./src/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		WebElement source=driver.findElement(By.id("fromPlaceName"));
		source.sendKeys("Ben");
		Thread.sleep(3000);
		
		
		//System.out.println(source.getText());
		JavascriptExecutor js=(JavascriptExecutor) driver;
		String valueText="return document.getElementById(\"fromPlaceName\").value";
		while(!valueText.contains("AIRPORT"))
			{
			source.sendKeys(Keys.ARROW_DOWN);
			
		}
		source.sendKeys(Keys.ENTER);
		System.out.println(js.executeScript(valueText));
		
		

	}

}
