package SeleDemo;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex2_ebox {
	private WebDriver driver;
	public static String baseUrl = "http://app.e-box.co.in/uploads/EventsTable.html";
	public static Boolean h2Present;
	public static String h2ElementText, headerTxt, tableDataTxt1, tableDataTxt2;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
	}

	@Test
	public void testWeb() throws Exception {
		// Step 1: Launch the application
		// Verify h2 tag is present
		h2Present = driver.findElements(By.xpath("//h2")).size() > 0;

		// Step 2: Verify the text in the h2 tag
		h2ElementText = driver.findElement(By.xpath("//h2")).getText();
		assert (h2ElementText.equals("Event Schedule"));

		// Step 3: Verify the text of th tag containing 'Start Time'
		headerTxt = driver.findElement(By.xpath("//th[contains(text(),'Start Time')]")).getText();
		assert (headerTxt.equals("Start Time"));

		// Step 4: Verify the text of td tag containing 'City Tower, Hall No 2'
		tableDataTxt1 = driver.findElement(By.xpath("//td[contains(text(),'City Tower, Hall No 2')]")).getText();
		assert (tableDataTxt1.equals("City Tower, Hall No 2"));

		// Step 5: Verify the text of td tag containing '11.11.2018 5.00 PM'
		tableDataTxt2 = driver.findElement(By.xpath("//td[contains(text(),'11.11.2018 5.00 PM')]")).getText();
		assert (tableDataTxt2.equals("11.11.2018 5.00 PM"));
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
