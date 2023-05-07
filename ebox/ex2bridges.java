package ebox;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class ex2bridges {
  private WebDriver driver;
  public static String baseUrl="http://app.e-box.co.in/uploads/popoverindexfirst.html";
  public static String imageName;
  public static String eventTitle;
  public static String imageTitle;
  @Before
  public void setUp() throws Exception 
  {
	  driver = new FirefoxDriver();
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
}
 
  @Test
  public void testWeb() throws Exception 
  {
	// Check title of the page
      Assert.assertEquals(driver.getTitle(), "Event Details");

      // Move to popover1 and verify image display
      WebElement popover1 = driver.findElement(By.id("popover1"));
      Actions builder = new Actions(driver);
      builder.moveToElement(popover1).perform();
      WebElement popoverImage = driver.findElement(By.xpath("//div[@class='popover-content']/img"));
      Assert.assertTrue(popoverImage.isDisplayed());

      // Check image title and source name
      WebElement popoverImageLink = driver.findElement(By.xpath("//div[@class='popover-content']/a"));
      imageTitle = popoverImageLink.getAttribute("title");
      imageName = popoverImage.getAttribute("src");
      Assert.assertEquals(imageTitle, "Diwali & Karwa Chauth");
      Assert.assertEquals(imageName, "diwali.jpg");
  }

  @After
  public void tearDown() throws Exception
 {
	  driver.quit();
  }

 






  
  
}

