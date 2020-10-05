package tables.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TablesAssignement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int i=0;
		System.setProperty("webdriver.gecko.driver", "./src/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement table=driver.findElement(By.id("product"));
		int rowCount=table.findElements(By.xpath("//table[@id='product']/tbody/tr")).size();
		//1.Total rowcount display
		
		
		System.out.println("Given table Rowcount is:"+rowCount);
		
	//2.To display the column count
		int columnCount=table.findElements(By.xpath("//table[@id='product']/tbody/tr[1]/th")).size();
		System.out.println("Given table Column count is:"+columnCount);
		
		//3.To display the 2nd row contents
		List<WebElement> RowList=table.findElements(By.xpath("//table[@id='product']/tbody/tr[3]/td"));
		System.out.println(RowList.get(0).getText());
		System.out.println(RowList.get(1).getText());
		System.out.println(RowList.get(2).getText());
		
	}
	
	

}
