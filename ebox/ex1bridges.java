package ebox;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ex1bridges {
    private WebDriver driver;
	public static String baseUrl="http://app.e-box.co.in/uploads/EventsTable.html";
	public static Boolean h2Present;
	public static String h2ElementText,headerTxt,tableDataTxt1,tableDataTxt2;


	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
	}


	@Test
	public void testWeb() throws Exception {
			//fill your code here
//		boolean h2Present = driver.findElements(By.xpath("//h2")).size() > 0;
//        Assert.assertTrue(h2Present);
//        String h2ElementText = driver.findElement(By.xpath("//h2")).getText();
//        Assert.assertEquals(h2ElementText, "Event Schedule", "Text in h2 tag is incorrect.");
//        String headerTxt = driver.findElement(By.xpath("//th[contains(text(),'Start Time')]")).getText();
//        Assert.assertEquals(headerTxt, "Start Time", "Text in th tag is incorrect.");
//        String tableDataTxt1 = driver.findElement(By.xpath("//td[contains(text(),'Vivekanandha Auditorium')]")).getText();
//        Assert.assertEquals(tableDataTxt1, "Vivekanandha Auditorium", "Text in td tag is incorrect.");
//        String tableDataTxt2 = driver.findElement(By.xpath("//td[contains(text(),'11.11.2018 5.00 PM')]")).getText();
//        Assert.assertEquals(tableDataTxt2, "11.11.2018 5.00 PM", "Text in td tag is incorrect.");
//    
		// Test the presence of h2 tag
        h2Present = driver.findElements(By.tagName("h2")).size() > 0;
        
        // Test the text in the h2 tag
        h2ElementText = driver.findElement(By.tagName("h2")).getText();
        
        // Test the text of th tag which contains 'Start Time'
        headerTxt = driver.findElement(By.xpath("//th[contains(text(),'Start Time')]")).getText();
        
        // Test the text of td tag which contains 'Vivekanandha Auditorium'
        tableDataTxt1 = driver.findElement(By.xpath("//td[contains(text(),'Vivekanandha Auditorium')]")).getText();
        
        // Test the text of td tag which contains '11.11.2018 5.00 PM'
        tableDataTxt2 = driver.findElement(By.xpath("//td[contains(text(),'11.11.2018 5.00 PM')]")).getText();
    
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();

	}

}

