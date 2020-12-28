package selenium4.advance.version;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MulipleWindows_Invoke_Practise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./src/Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> windowHandle=driver.getWindowHandles();
		Iterator<String> it=windowHandle.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		Thread.sleep(3000);
		driver.get("https://rahulshettyacademy.com/#/index");
		String content_first=driver.findElements(By.xpath("//a[contains(@href,'https://courses.rahulshettyacademy.com/p')]")).get(1).getText();
		System.out.println("1st course"+content_first);
		Thread.sleep(3000);
		driver.switchTo().window(parentId);
		driver.findElement(By.name("name")).sendKeys(content_first);
		
		
	}

}
