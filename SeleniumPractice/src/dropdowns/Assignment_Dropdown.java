package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./src/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		int i;
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement dropdownBox=driver.findElement(By.id("autocomplete"));
		dropdownBox.sendKeys("uni");
		
	Thread.sleep(3000);
		for(i=0;i<5;i++)
		{
			dropdownBox.sendKeys(Keys.ARROW_DOWN);
			
			if(i==4)
			{
				dropdownBox.sendKeys(Keys.ENTER);
				System.out.println(dropdownBox.getAttribute("value"));
				break;
				
			}
			
		}
		if(i!=4)
		{
			dropdownBox.sendKeys(Keys.ARROW_DOWN);
		}
		
		
		
}

}
