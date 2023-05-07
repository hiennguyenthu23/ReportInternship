package SeleDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex6_ebox {

	private WebDriver driver;
	public static String baseUrl="http://app.e-box.co.in/uploads/handlingRegex.html";
	private static String h2Element = "Registration";
    private static String result1 = "validationResult";
    private static String result2 = "validationResult";
    private static String result3 = "validationResult";
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.get(baseUrl);
		
	}

	@Test
    public void testWeb() throws Exception{
        // Test Scenario 1
        WebElement h2 = driver.findElement(By.tagName("h2"));
        String actualH2Text = h2.getText();
        Assert.assertEquals(h2Element, actualH2Text);

        // Test Scenario 2
        WebElement validateButton = driver.findElement(By.id("validate_button"));
        validateButton.click();
        WebElement result1Div = driver.findElement(By.id(result1));
        String actualResult1 = result1Div.getText();
        String expectedResult1 = "First Name cannot be empty\n" +
                "Last Name cannot be empty\n" +
                "City cannot be empty\n" +
                "Country cannot be empty\n" +
                "Username cannot be empty\n" +
                "Password cannot be empty\n" +
                "Pincode cannot be empty\n" +
                "State cannot be empty\n" +
                "E-mail cannot be empty";
        Assert.assertEquals(expectedResult1, actualResult1);

        // Test Scenario 3
        driver.findElement(By.name("fname")).sendKeys("Maya");
        driver.findElement(By.name("lname")).sendKeys("Sri");
        driver.findElement(By.name("address")).sendKeys("124, Sai baba layout");
        driver.findElement(By.name("city")).sendKeys("Coimbatore");
        driver.findElement(By.name("state")).sendKeys("Tamil Nadu");
        driver.findElement(By.name("country")).sendKeys("India");
        driver.findElement(By.name("pin")).sendKeys("654343");
        driver.findElement(By.name("uname")).sendKeys("Maya");
        driver.findElement(By.name("password")).sendKeys("maya123");
        driver.findElement(By.name("email")).sendKeys("mayagmail.com");
        validateButton.click();
        WebElement result2Div = driver.findElement(By.id(result2));
        String actualResult2 = result2Div.getText();
        String expectedResult2 = "State should be 2 characters\n" +
                "Invalid E-mail Id";
        Assert.assertEquals(expectedResult2, actualResult2);

        // Test Scenario 4
        driver.findElement(By.name("state")).clear();
        driver.findElement(By.name("state")).sendKeys("TN");
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("maya@gmail.com");
        validateButton.click();
        WebElement result3Div = driver.findElement(By.id(result3));
        String actualResult3 = result3Div.getText();
        String expectedResult3 = "Registration Successful";
        Assert.assertEquals(expectedResult3, actualResult3);
    }

    @After
    public void tearDown() throws Exception{
        driver.quit();
    }

}

