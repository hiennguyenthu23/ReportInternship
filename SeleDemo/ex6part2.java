package SeleDemo;

import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ex6part2 {
    static WebDriver driver;
    static String baseUrl = "http://app.e-box.co.in/uploads/handlingRegex.html";
    static String h2Element = "Registration";
    static String result1, result2, result3;

    
    @Before
    public  void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }
    @Test
    public  void testWeb() {
        // Check the h2 tag
        WebElement h2Tag = driver.findElement(By.xpath("//h1"));
        if (h2Tag.getText().equals(h2Element)) {
            System.out.println("h2 tag verified.");
        } else {
            System.out.println("h2 tag verification failed.");
        }

        // Test case 2 - validate with empty fields
        WebElement validateButton = driver.findElement(By.id("submit"));
        validateButton.click();
        WebElement validationDiv = driver.findElement(By.id("validationResult"));
        result1 = validationDiv.getText();
        System.out.println("Result 1: " + result1);

        // Test case 3 - validate with invalid email and state
        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        WebElement address = driver.findElement(By.id("address"));
        WebElement city = driver.findElement(By.id("city"));
        WebElement state = driver.findElement(By.id("state"));
        WebElement country = driver.findElement(By.id("country"));
        WebElement pincode = driver.findElement(By.id("pincode"));
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement email = driver.findElement(By.id("email"));

        firstName.sendKeys("Maya");
        lastName.sendKeys("Sri");
        address.sendKeys("124, Sai baba layout");
        city.sendKeys("Coimbatore");
        state.sendKeys("Tamil Nadu");
        country.sendKeys("India");
        pincode.sendKeys("654343");
        username.sendKeys("Maya");
        password.sendKeys("maya123");
        email.sendKeys("mayagmail.com");

        validateButton.click();
        result2 = validationDiv.getText();
        System.out.println("Result 2: " + result2);

        // Test case 4 - validate with valid data
        state.clear();
        email.clear();
        state.sendKeys("TN");
        email.sendKeys("maya@gmail.com");

        validateButton.click();
        result3 = validationDiv.getText();
        System.out.println("Result 3: " + result3);

        // Handle regex pattern for email validation
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        Pattern pattern = Pattern.compile(emailRegex);

        Matcher matcher1 = pattern.matcher("invalidemail.com");
        System.out.println("Email validation: " + matcher1.matches()); // should print false

        Matcher matcher2 = pattern.matcher("valid.email@domain.com");
        System.out.println("Email validation: " + matcher2.matches()); // should print true
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}
