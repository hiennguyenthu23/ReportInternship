package topic16ebox;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ex1hots {
	private WebDriver driver;
	public static String baseUrl="https://app.talentrank.in/uploads/registrationInSelenium.html";
	private boolean acceptNextAlert = true;
	public static Boolean userName,passWord;
	public static String h1Element,nameTxt,genderTxt,eventTxt,result;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testWeb() throws Exception {

		//fill your code here
		// Step 1
		driver.findElement(By.tagName("h1")).isDisplayed();
		// Step 2
		h1Element = driver.findElement(By.tagName("h1")).getText();
		assert h1Element.equals("Registration form");
		driver.findElement(By.xpath("/html/body/center/table/tbody/tr[1]/td[1]")).isDisplayed();
		nameTxt = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[1]/td[1]")).getText();
		driver.findElement(By.tagName("name")).isDisplayed();
		assert nameTxt.equals("Name");
		userName = driver.findElement(By.tagName("username")).isDisplayed();
		assertTrue(userName);
		passWord = driver.findElement(By.tagName("passWord")).isDisplayed();
		assertTrue(passWord);
		// Step 5: Fill the form with given inputs
		driver.findElement(By.name("name")).sendKeys("MayaSri");
		driver.findElement(By.name("userName")).sendKeys("Maya");
		driver.findElement(By.name("password")).sendKeys("Maya123");
		driver.findElement(By.name("re-EnterPassword")).sendKeys("Maya123");
		driver.findElement(By.name("address")).sendKeys("155th Avenue, London");
		driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td[3]/input[2]")).click();
		Select district = new Select(driver.findElement(By.name("districtName")));
		district.selectByVisibleText("Coimbatore");
		driver.findElement(By.cssSelector("input[value='Wedding']")).click();
		driver.findElement(By.name("register")).click();

		// Step 6: Test the value selected in the radio button and checkbox
		genderTxt = driver.findElement(By.xpath("(//input[@name='gender'])[2]")).getAttribute("value");
		assertEquals("female", genderTxt);
		eventTxt = driver.findElement(By.name("events[]")).getAttribute("value");
		assertEquals("wedding", eventTxt);

		// Step 7: Test the presence and text in the div with id 'result'
		WebElement div = driver.findElement(By.id("result"));
		assertTrue(div.isDisplayed());
		result = div.getText();
		assertEquals("Registration Successful", result);

	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
