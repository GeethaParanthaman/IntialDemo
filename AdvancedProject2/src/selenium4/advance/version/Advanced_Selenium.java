package selenium4.advance.version;

import org.openqa.selenium.By;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Advanced_Selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./src/Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(3000);
		WebElement EditTextBox=driver.findElement(By.name("email"));
		System.out.println(driver.findElement(withTagName("label").above(EditTextBox)).getText());
		
		WebElement dateLabel=driver.findElement(By.xpath("//label[@for='dateofBirth']"));
		driver.findElement(withTagName("input").below(dateLabel)).sendKeys("21/09/1991");
		Thread.sleep(3000);
		WebElement checkBoxCheck=driver.findElement(By.className("form-check-label"));
		driver.findElement(withTagName("input").toLeftOf(checkBoxCheck)).click();
		Thread.sleep(1000);
		WebElement radioButtonClick=driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(withTagName("input").toRightOf(radioButtonClick)).getText());
		
}

}
