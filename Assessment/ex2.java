package Assessment;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

public class ex2 {
	private WebDriver driver;
	public static String baseUrl="http://app.e-box.co.in/uploads/Forms_new1.html";
	private boolean acceptNextAlert = true;
	public static Boolean h1Present, fieldname1, fieldname2, fieldname3;
	public static String h1Element, welcomeMsg;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
	}


	@Test
	public void testWeb() throws Exception {

		//fill your code here
		h1Present = driver.findElement(By.tagName("h1")).isDisplayed();
		h1Element = driver.findElement(By.tagName("h1")).getText();
		
		assertEquals(h1Element, "Login Page");
		fieldname1 = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[2]/input")).isDisplayed();
		fieldname2 = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/input")).isDisplayed();
		fieldname3 = driver.findElement(By.id("loginButton")).isDisplayed();

		acceptNextAlert = driver.findElement(By.id("result")).isDisplayed();
		driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[2]/input")).sendKeys("Minion");
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/input")).sendKeys("minion");
		driver.findElement(By.id("loginButton")).click();
		
		welcomeMsg = driver.findElement(By.id("result")).getText();
		assertEquals(welcomeMsg, "Welcome!!!");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();

	}


}

