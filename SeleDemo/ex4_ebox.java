package SeleDemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ex4_ebox {
	private WebDriver driver;
	public static String baseUrl = "https://app.talentrank.in/uploads/indexWaits1_new.html";
	public static String str1;
	public static String str2;
	public static String str3;
	public static String eventName;
	public static String hallName;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
	}

	@Test
	public void testWeb() throws Exception {
		// Wait for the page to load completely
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='home']/a")));

	    // Verify HOME link text
	    WebElement homeLink = driver.findElement(By.xpath("//div[@id='home']/a"));
	    String str1 = homeLink.getText();
	    assertEquals("HOME", str1);

	    // Verify EVENT link text
	    WebElement eventLink = driver.findElement(By.xpath("//div[@id='event']/a"));
	    String str2 = eventLink.getText();
	    assertEquals("EVENT", str2);

	    // Verify HALL link text
	    WebElement hallLink = driver.findElement(By.xpath("//div[@id='hall']/a"));
	    String str3 = hallLink.getText();
	    assertEquals("HALL", str3);

	    // Click on EVENT link and wait for corresponding details
	    eventLink.click();
	    WebElement eventNameElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='eventdetails']/h2")));
	    WebElement hallNameElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='eventdetails']/p")));

	    // Get event and hall names
	    String eventName = eventNameElement.getText();
	    String hallName = hallNameElement.getText();

	    // Verify event and hall names
	    assertEquals("Event Name: Conference", eventName);
	    assertEquals("Hall Name: Main Hall", hallName);
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

}
