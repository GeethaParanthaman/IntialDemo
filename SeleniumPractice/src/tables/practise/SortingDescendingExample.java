package tables.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;



public class SortingDescendingExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./src/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		Thread.sleep(3000);
		List<WebElement> prodcutNames=driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr/td[2]"));
		
		driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[2]")).click();
		Thread.sleep(3000);
		ArrayList<String> originalArray=new ArrayList<String>();
		for(int i=0;i<prodcutNames.size();i++)
		{
			originalArray.add(prodcutNames.get(i).getText());
		}
		System.out.println("*******original"+originalArray);
		ArrayList<String> copyArray=new ArrayList<String>();
		for(int i=0;i<originalArray.size();i++)
		{
			copyArray.add(originalArray.get(i));
		}
		System.out.println("CopyArray********************"+copyArray);
		Collections.sort(copyArray);
		Collections.reverse(copyArray);
		Assert.assertTrue(copyArray.equals(originalArray));
		
	}

}
