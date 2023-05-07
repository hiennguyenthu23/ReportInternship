package ebox;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class exbox5 {
	private WebDriver driver;
	public static String baseUrl = "https://app.talentrank.in/uploads/index_10552.html";;
	public static String rudolfinumHall;
	public static String CarnegieHall;
	public static String CadoganHall;
	public static String QueenElizabethHall;
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();		
		driver.get(baseUrl);
	}
	@Test
	public void testWeb() throws Exception {
			driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
        //rudolfinumHall = driver.findElement(By.xpath("//*[@id=\"Cassandra\"]/div[2]/div[5]")).getText();
        rudolfinumHall = driver.findElement(By.cssSelector("#Cassandra > div.hall-details > div.hall-owner")).getText();
        //Assert.assertEquals("Cassandra",rudolfinumHall);
        Assert.assertTrue(rudolfinumHall.contains("Cassandra"));
        CarnegieHall = driver.findElement(By.cssSelector("#John > div.hall-details > div.hall-owner")).getText();
        Assert.assertTrue(CarnegieHall.contains("John"));
        //Assert.assertEquals("John",CarnegieHall);
        CadoganHall = driver.findElement(By.cssSelector("#Sophia > div.hall-details > div.hall-owner")).getText();
        Assert.assertTrue(CadoganHall.contains("Sophia"));
        //Assert.assertEquals("Sophia",CadoganHall);
        QueenElizabethHall = driver.findElement(By.cssSelector("#Emma > div.hall-details > div.hall-owner")).getText();
        Assert.assertTrue(QueenElizabethHall.contains("Emma"));
        //Assert.assertEquals("Emma",QueenElizabethHall);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
