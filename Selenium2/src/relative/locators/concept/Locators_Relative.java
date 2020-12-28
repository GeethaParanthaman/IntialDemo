package relative.locators.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import net.bytebuddy.build.HashCodeAndEqualsPlugin.WithNonNullableFields;

public class Locators_Relative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./src/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
	//above
		WebElement emailEditBox=driver.findElement(By.name("email"));
		driver.findElement(WithTagName("label")
	}

}
