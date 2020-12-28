package allConcepts.End2End;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LoginClick;
import pageObject.LoginPage;

/*
 *  testCaseName="Login check";
 *  testcaseDescription="To ensure login for the given credentials"
    author="Geetha S"
    browser="Chrome"
 */
public class HomePage extends Base {
	WebDriver driver;
	private static Logger log = LogManager.getLogger(ValidateTitle.class.getName());

	
	@BeforeTest
	public void startTest() throws IOException {
		driver = browserInitialise();
		log.info("Chrome for login page initiated");

	}

	@Test(dataProvider = "sendingData")
	public void toScreen(String email, String passwrd) {
		driver.get(propObject.getProperty("url"));
		// To create object for click on Login link
		LoginPage loginObj = new LoginPage(driver);
		loginObj.getLogin().click();

		// to Create object for class which contains inside the login page
		LoginClick loginClickObj = new LoginClick(driver);
		loginClickObj.getEmailId().sendKeys(email);
		loginClickObj.getPassword().sendKeys(passwrd);
		loginClickObj.logInClick().click();

		log.info("chrome for user details given");

	}

	// sending data with hardcode
	@DataProvider
	public Object[][] sendingData() {
		Object[][] dataSending = new Object[2][2];

		// Oth index

		dataSending[0][0] = "validuser@gamil.com";
		dataSending[0][1] = "1st user";

		// cmdcd1st index
		dataSending[1][0] = "invaliduser@gamil.com";
		dataSending[1][1] = "2nd user";

		return dataSending;
	}

	@AfterTest
	public void browserClose() {
		driver.close();
	}

}
