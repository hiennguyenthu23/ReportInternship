package SeleDemo;

import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class demoebox {
	private WebDriver driver;
	public static String baseUrl = "http://app.e-box.co.in/uploads/handlingRegex.html";
	private boolean acceptNextAlert = true;
	public static Boolean userName, passWord;
	public static String h1Element, result1, result2, result3;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\hienn\\eclipse\\SeleniumDemo\\msedgedriver.exe");

		// String url =
		// "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver = new EdgeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testWeb() throws Exception {
		// fill your code
		// test1
		h1Element = driver.findElement(By.cssSelector("body > center > h1 > center")).getText();
		System.out.println(h1Element);
		// test2
		driver.findElement(By.name("validate_button")).submit(); // có thể dùng submit hoặc click cũng được
		result1 = driver.findElement(By.id("validationResult")).getText();
		System.out.print(result1);
		// test3
		driver.findElement(By.id("first_name")).sendKeys("Maya");
		driver.findElement(By.id("last_name")).sendKeys("Sri");
		driver.findElement(By.id("address")).sendKeys("124, Sai baba layout");
		driver.findElement(By.id("city")).sendKeys("Coimbatore");
		driver.findElement(By.id("state")).sendKeys("Tamil Nadu");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("pincode")).sendKeys("654343");
		driver.findElement(By.id("username")).sendKeys("Maya");
		driver.findElement(By.id("password")).sendKeys("maya123");
		driver.findElement(By.id("email")).sendKeys("mayagmail.com");
		driver.findElement(By.name("validate_button")).submit();
		result2 = driver.findElement(By.id("validationResult")).getText();
		System.out.print(result2);
		// test4
		driver.findElement(By.id("first_name")).clear();
		driver.findElement(By.id("last_name")).clear();
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("state")).clear();
		driver.findElement(By.id("country")).clear();
		driver.findElement(By.id("pincode")).clear();
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("first_name")).sendKeys("Maya");
		driver.findElement(By.id("last_name")).sendKeys("Sri");
		driver.findElement(By.id("address")).sendKeys("124, Sai baba layout");
		driver.findElement(By.id("city")).sendKeys("Coimbatore");
		driver.findElement(By.id("state")).sendKeys("TN");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("pincode")).sendKeys("654343");
		driver.findElement(By.id("username")).sendKeys("Maya");
		driver.findElement(By.id("password")).sendKeys("maya123");
		driver.findElement(By.id("email")).sendKeys("maya@gmail.com");
		driver.findElement(By.name("validate_button")).submit();
		result3 = driver.findElement(By.id("validationResult")).getText();
		System.out.print(result3);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
