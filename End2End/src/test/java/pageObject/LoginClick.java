package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginClick {
	WebDriver driver;
	
	By emailId=By.id("user_email");
	By password=By.id("user_password");
	By logIn=By.name("commit");
	
	public LoginClick(WebDriver driver)
	{
		this.driver=driver;
		
	}


public WebElement getEmailId() {
	// TODO Auto-generated method stub
	return driver.findElement(emailId);
}

public WebElement getPassword()
{
	return driver.findElement(password);
	
}
public WebElement logInClick()
{
	return driver.findElement(logIn);
}





}
