package topic15ebox;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;

public class ex2 {
	private WebDriver driver;
	public static String baseUrl = "http://labadmin.hcl-edtech.com/uploads/Selenium_base_projects/19437-color.html";
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	public Integer passCount = 0;
	public Integer totalCount = 1;
	public static String colorCode = "";

	@Before
	public void setUp() throws Exception {
		// fill your code here
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@Test
	public void testWeb() throws Exception {
		// fill your code here
		String cellColor = driver.findElement(By.cssSelector("table:first-child tr:nth-child(1) td:nth-child(1)"))
				.getCssValue("background-color");
		Assert.assertEquals(colorCode, Color.fromString(cellColor).asHex().toUpperCase());
		passCount++;
	}

	@After
	public void tearDown() throws Exception {
		// fill your code here
		driver.quit();
		if (passCount == totalCount) {
			System.out.println("All " + passCount + " test(s) passed");
		} else {
			System.out.println(passCount + " out of " + totalCount + " tests passed");
		}
	}
}
