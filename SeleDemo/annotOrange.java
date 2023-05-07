package SeleDemo;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class annotOrange {
	WebDriver driver;
	String baseURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	@Before
	public void setUp() throws Exception{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\hienn\\eclipse\\SeleniumDemo\\msedgedriver.exe");

		//String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver = new EdgeDriver();
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test
	public void logIn() throws Exception {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector(
				"#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div.oxd-form-actions.orangehrm-login-action > button"))
				.click();

	}
	@Test
	public void logOut() throws Exception {
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		driver.findElement(By.cssSelector(
//				"#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div.oxd-form-actions.orangehrm-login-action > button"))
//				.click();
		logIn();
		driver.findElement(By.cssSelector(
				"#app > div.oxd-layout > div.oxd-layout-navigation > header > div.oxd-topbar-header > div.oxd-topbar-header-userarea > ul > li > span"))
				.click();
		driver.findElement(By.cssSelector(
				"#app > div.oxd-layout > div.oxd-layout-navigation > header > div.oxd-topbar-header > div.oxd-topbar-header-userarea > ul > li > ul > li:nth-child(4) > a"))
				.click();
	}

	@After
	public void tearDown() throws Exception{
		driver.quit();
	}
}
