package SeleDemo;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class Ex1_ebox {
    private WebDriver driver;
    public static String baseUrl="http://app.e-box.co.in/uploads/Eventsforce.html";
    public static Boolean firstDivPresent,secondDivPresent,thirdDivPresent;
    public static String firstDivElementText,secondDivElementText,thirdDivElementText;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
    }

    @Test
    public void testWeb() throws Exception {

        //fill your code
        //1st element present
        firstDivPresent = null;
        firstDivPresent = driver.findElement(By.id("firstDiv")).isDisplayed();

        //1st element text
        firstDivElementText = driver.findElement(By.id("firstDiv")).getText();

        //2nd element present
        secondDivPresent = driver.findElement(By.id("secondDiv")).isDisplayed();

        //2nd element text
        secondDivElementText = driver.findElement(By.id("secondDiv")).getText();

        //3rd element present
        thirdDivPresent =  driver.findElement(By.id("thirdDiv")).isDisplayed();

        //3rd element text
        thirdDivElementText = driver.findElement(By.id("thirdDiv")).getText();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}