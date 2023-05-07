package topic16ebox;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;

public class ex1Bridges {
	public static WebDriver driver;
	public static String baseUrl = "http://app.e-box.co.in/uploads/events_10517.html";
	public static String titleNov;
	public static String titleOct;
	public static String pTagOne;
	public static String pTagTwo;
	public static String pTagThree;
	public static String H4TagThree;
	public static String H4TagOne;
	public static String H4TagTwo;
	public static String idRecent;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		Dimension d = new Dimension(1024, 768);
		// Resize the current window to the given dimension
		driver.manage().window().setSize(d);
	}

	@Test
	public void testWeb() throws Exception {
		driver.get(baseUrl);

		// Get the text in the h2 tags
		titleOct = driver.findElement(By.xpath("//h3[contains(text(),'Events in October')]")).getText();
		titleNov = driver.findElement(By.xpath("//h3[contains(text(),'Events in November')]")).getText();

		// Get the text in the p and h4 tags

		H4TagOne = driver.findElement(By.xpath("//*[@id=\"selectable-oct\"]/div[1]/div[2]/h4")).getText();
		pTagOne = driver.findElement(By.xpath("//*[@id=\"selectable-oct\"]/div[1]/div[2]/p")).getText();
		H4TagTwo = driver.findElement(By.id("secondHeader")).getText();
		pTagTwo = driver.findElement(By.id("secondP")).getText();
		H4TagThree = driver.findElement(By.id("thirdHeader")).getText();
		pTagThree = driver.findElement(By.id("thirdP")).getText();

		// Select multiple elements using the control key
		WebElement firstElement = driver.findElement(By.xpath("//*[@id=\"selectable-oct\"]/div[1]"));
		WebElement secondElement = driver.findElement(By.xpath("//*[@id=\"selectable-oct\"]/div[2]"));
		WebElement thirdElement = driver.findElement(By.xpath("//*[@id=\"selectable-oct\"]/div[3]"));
		firstElement.sendKeys(Keys.CONTROL);
		secondElement.sendKeys(Keys.CONTROL);
		thirdElement.sendKeys(Keys.CONTROL);

		// Check if the recently searched items are displayed correctly
		idRecent = driver.findElement(By.id("recent")).getText();
		assert (idRecent.contains("Changing the Guard"));
		assert (idRecent.contains("London Restaurant Festival"));
		assert (idRecent.contains("Halloween in London"));

	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
