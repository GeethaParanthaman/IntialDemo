package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	// Login link location
	By loginlink = By.linkText("Login");
	// Featured courses location
	By title = By.xpath("//section[@id='content']/div[1]/div[1]/h2");
	// tabnavigators location
	By navagators = By.xpath("//ul[contains(@class,'navbar-nav navbar-right')]");

	public WebElement getLogin() {
		return driver.findElement(loginlink);
	}

	public WebElement getTitle() {
		return driver.findElement(title);
	}

	public WebElement navigatorsdisplay() {
		return driver.findElement(navagators);
	}
}
