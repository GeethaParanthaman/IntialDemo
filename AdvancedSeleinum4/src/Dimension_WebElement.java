import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dimension_WebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./src/Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement elemnt=driver.findElement(By.name("name"));
		System.out.println(elemnt.getRect().getDimension().getHeight());
		System.out.println(elemnt.getRect().getDimension().getWidth());
		
	}

}
