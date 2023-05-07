package topic15ebox;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ex4 {
	private WebDriver driver;
	public static String baseUrl = "http://labadmin.hcl-edtech.com/uploads/Selenium_base_projects/19440-search.html";
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	public static boolean isFieldPresent = false;
	public static boolean isButtonPresent = false;
	public static String heading = "";
	public static String result1 = "";
	public static String result2 = "";
	public static String result3 = "";

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
		isFieldPresent = driver.findElement(By.id("someText")).isDisplayed();
        isButtonPresent = driver.findElement(By.id("search")).isDisplayed();

        WebElement field = driver.findElement(By.id("someText"));
        field.sendKeys("Corporate events");
        WebElement button = driver.findElement(By.id("search"));
        button.click();

        WebElement resultDiv = driver.findElement(By.id("result"));
        //heading = resultDiv.findElement(By.tagName("h1")).getText();
        result1 = resultDiv.findElement(By.tagName("h1")).getText();

        field.clear();
        field.sendKeys("Sports events");
        button.click();

        resultDiv = driver.findElement(By.id("result"));
        //heading = resultDiv.findElement(By.tagName("h1")).getText();
        result2 = resultDiv.findElement(By.tagName("h1")).getText();

        field.clear();
        field.sendKeys("Political events");
        button.click();

        resultDiv = driver.findElement(By.id("result"));
        //heading = resultDiv.findElement(By.tagName("h1")).getText();
        result3 = resultDiv.findElement(By.tagName("h1")).getText();
    
	}

	@After
	public void tearDown() throws Exception {
		// fill your code here
		//driver.quit();
	}

}
