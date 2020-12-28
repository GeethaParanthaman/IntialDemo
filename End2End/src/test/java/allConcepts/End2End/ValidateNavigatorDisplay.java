package allConcepts.End2End;

import java.io.IOException;

/*
 *  testCaseName="ValidateNavigatorDisplay";
 *  testcaseDescription="To verify the navigator display in the home screen"
    author="Geetha S"
    browser="Chrome"
 */

import org.apache.logging.log4j.*;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

import pageObject.LoginPage;

public class ValidateNavigatorDisplay extends Base {
	WebDriver driver;
	private static Logger log = LogManager.getLogger(ValidateNavigatorDisplay.class.getName());

	@BeforeTest

	public void startTest() throws IOException {

		driver = browserInitialise();
		driver.get(propObject.getProperty("url"));
		log.info("Intialized driver");
	}

	@Test
	public void titleValidate() {
		// Create object for LoginPage
		LoginPage loginObj = new LoginPage(driver);
		// verification of tab navigators display

		Assert.assertTrue(loginObj.navigatorsdisplay().isDisplayed());
		driver.close();
		log.info("Navigator displayed");

	}

	@AfterTest
	public void browserClose() {
		driver.close();
		log.info("Chrome brower get closed");
	}

}
