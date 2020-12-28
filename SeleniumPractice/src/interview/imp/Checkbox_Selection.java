package interview.imp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox_Selection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./src/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(6000);
		
		// 1.Select any checkbox
		driver.findElement(By.id("checkBoxOption1")).click();
		// 2.Grab the label of slected texbox
		String checkBoxName = driver.findElement(By.id("checkBoxOption1")).getAttribute("value");
		// 3.slect the value from dropdown where we get from grabed value
		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
		Select selectComboValue = new Select(dropDown);
		selectComboValue.selectByValue(checkBoxName);

		// 4.Enter grabled value in textbox
		driver.findElement(By.id("name")).sendKeys(checkBoxName);

		// 5.check the values given in textbox should be available in alert
		driver.findElement(By.id("alertbtn")).click();
		// System.out.println(driver.switchTo().alert().getText());
		String alertText = driver.switchTo().alert().getText();
		//to close the opened window
		driver.switchTo().alert().dismiss();
		if (alertText.contains(checkBoxName)) {

			System.out.println("Contains the given textbox value");
		}

		else
			System.out.println("Not contains");
	}
	

}
