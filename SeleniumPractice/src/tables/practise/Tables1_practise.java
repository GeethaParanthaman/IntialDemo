package tables.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tables1_practise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int sum=0;
		System.setProperty("webdriver.gecko.driver", "./src/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		Thread.sleep(10000);
		//Whole table path
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
//Row counwise
	//int rowCount=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
	//Column count
	int columnCount=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
	//column wise value iteartion
	for(int i=0;i<columnCount-2;i++)
	{
		
				String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int integervalue=Integer.parseInt(value);
			sum=sum+integervalue;
				
	}
System.out.println("sum of values from for loop"+sum);

	String extraValue=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
	//System.out.println(driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div[2]")).getText());
	int extraVlaueInt=Integer.parseInt(extraValue);
	int totalValue=extraVlaueInt+sum;
	System.out.println("Sum of total value"+totalValue);
	
	String totalColumnValue=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
	int totalColumnValueInt=Integer.parseInt(totalColumnValue);
	if(totalValue==totalColumnValueInt)
	{
		System.out.println("Value is matched");
		
		
	}
	else 
		System.out.println("Value not matched");
	
	}

}

