package topic15ebox;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ex1topic15 {
	private WebDriver driver;
	public static String baseUrl = "https://labadmin.hcl-edtech.com/uploads/Selenium_base_projects/19248-text.html";
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	public Integer passCount = 0;
	public Integer totalCount = 2;
	public static boolean isTagPresent = false;
	public static String h1Text = "";

	@Before
	public void setUp() throws Exception {
		// fill your code here
		driver = new FirefoxDriver();
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);

	}

	@Test
	public void testWeb() throws Exception {
		// fill your code here
		isTagPresent = driver.findElement(By.tagName("h1")).isDisplayed();
		h1Text = driver.findElement(By.tagName("h1")).getText();
	}

	@After
	public void tearDown() throws Exception {
		// fill your code here
		driver.quit();
	}
}
