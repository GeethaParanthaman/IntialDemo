package allConcepts.End2End;

import java.io.IOException;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.LoginPage;

/*
 *  testCaseName="ValidateTitleCheck";
 *  testcaseDescription="To verify the title matched with the expected one"
    author="Geetha S"
    browser="Chrome"
 */

public class ValidateTitle extends Base {
	WebDriver driver;
	private static Logger log = LogManager.getLogger(ValidateTitle.class.getName());

	@BeforeTest
	public void startTest() throws IOException {
		driver = browserInitialise();
		driver.get(propObject.getProperty("url"));
		log.info("Broswer intiated for title check");
	}

	@Test
	public void titleValidate() {

		// Create object for LoginPage
		LoginPage loginObj = new LoginPage(driver);
		// invoke the title method to verify the title check
		String Expectedtext = loginObj.getTitle().getText();

		Assert.assertEquals(Expectedtext, "FEATURED COURSES");

	}

	@AfterTest
	public void browserClose() {
		driver.close();
	}

}
