package Assessment;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class ex3 {
  	 WebDriver driver;
	 public static String alertMessage;
	 public static String resultTag;
	 public static String baseUrl = "http://app.e-box.co.in/uploads/index_10538.html";
	 public static String name;
	 public static String venue;
	 public static String date;
	 public static String price;
	 public static String count;
	 
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();		
	}

	

	@Test
	public void testWeb() throws Exception {
		driver.get(baseUrl);
		driver.findElement(By.id("name")).sendKeys("Birthday Party");
		driver.findElement(By.id("venue")).sendKeys("HR Mahal");
		driver.findElement(By.id("date")).clear();
		driver.findElement(By.id("date")).sendKeys("06/09/2018");
		driver.findElement(By.id("price")).sendKeys("120000");
		driver.findElement(By.id("count")).sendKeys("1");
		driver.findElement(By.id("addEvent")).click();
		
		Alert alert = driver.switchTo().alert();
		alertMessage = alert.getText();
		alert.accept();
		Assert.assertEquals(alertMessage, "Event added successfully");
		System.out.println(alertMessage);
		
		resultTag = driver.findElement(By.id("resultTable")).getText();
		System.out.println(resultTag);
		
		name = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[2]/td[1]")).getText();
		venue = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[2]/td[2]")).getText();
		date = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[2]/td[3]")).getText();
		price = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[2]/td[4]")).getText();
		
		Assert.assertEquals(name, "Birthday Party");
		Assert.assertEquals(venue, "HR Mahal");
		Assert.assertEquals(date, "06-09-2018");
		Assert.assertEquals(price, "120000");
			
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	
}

