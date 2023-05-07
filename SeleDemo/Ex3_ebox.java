package SeleDemo;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex3_ebox {
	private WebDriver driver;
	public static String baseUrl="http://app.e-box.co.in/uploads/attribute.html";
	public static Boolean h2Present,tablePresent;
	public static String h2ElementText,borderAtt,columnSpan1,columnSpan2;


	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
	}


	@Test
	public void testWeb() throws Exception {

			//fill your code 
	// Test for the presence of h2 tag
        h2Present = driver.findElements(By.tagName("h2")).size() > 0;

        // Test the text in the h2 tag
        WebElement h2Element = driver.findElement(By.tagName("h2"));
        h2ElementText = h2Element.getText();

        // Test the presence of table tag with attribute 'border'
        borderAtt = driver.findElement(By.xpath("//table[@border='1']")).getAttribute("border");

        // Test the presence of attribute 'colspan' for the Xpath tr[4]td[3] in the table
        columnSpan1 = driver.findElement(By.xpath("//tr[4]/td[3]")).getAttribute("colspan");

        // Test the presence of attribute 'colspan' for the Xpath tr[10]td[3] in the table
        columnSpan2 = driver.findElement(By.xpath("//tr[10]/td[3]")).getAttribute("colspan");
    
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

}

