package topic16ebox;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ex1 {
    private WebDriver driver;
	public static String baseUrl="http://app.e-box.co.in/uploads/weddingc.html";
	public static Boolean h2Present;
	public static String h2ElementText;


	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
	}


	@Test
	public void testWeb() throws Exception {

			//Fill your code here
		 // Test the presence of h2 tag
        h2Present = driver.findElements(By.tagName("h2")).size() > 0;
        
        // Test the text in the h2 tag
        h2ElementText = driver.findElement(By.tagName("h2")).getText();
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
		
	}

	
}

