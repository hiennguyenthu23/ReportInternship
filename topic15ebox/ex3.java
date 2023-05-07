package topic15ebox;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ex3 {
  private WebDriver driver;
  public static String baseUrl = "http://labadmin.hcl-edtech.com/uploads/Selenium_base_projects/19438-login.html";
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  public static boolean isField1Present = false;
  public static boolean isField2Present = false;
  public static boolean isButtonPresent = false;
  public static String result = "";

  @Before
  public void setUp() throws Exception {
    //fill your code here
	  driver = new FirefoxDriver();
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
  }


  @Test
  public void testWeb() throws Exception {
     //fill your code here
	  driver.findElement(By.id("username")).isDisplayed();
	    isField1Present = true;
	    driver.findElement(By.id("password")).isDisplayed();
	    isField2Present = true;
	    driver.findElement(By.id("submit")).isDisplayed();
	    isButtonPresent = true;
	    driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("username")).sendKeys("Aishwarya");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("12345");
	    driver.findElement(By.id("submit")).click();
	    assertEquals("Welcome Aishwarya", driver.findElement(By.id("welcome")).getText());
	    result = "Welcome Aishwarya";
  }

   @After
  public void tearDown() throws Exception {
	//fill your code here
	  //driver.quit();
  }

}
