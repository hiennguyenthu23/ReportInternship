package SeleDemo;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ex4parrt {
  private WebDriver driver;
  public static String baseUrl="https://app.talentrank.in/uploads/indexWaits1_new.html";
  public static String str1;
  public static String str2;
  public static String str3;
  public static String eventName;
  public static String hallName;

    
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
    str1 = driver.findElement(By.id("homeLink")).getText();
    	str2 = driver.findElement(By.id("event")).getText();
		str3 = driver.findElement(By.id("hall")).getText();
		driver.findElement(By.id("event")).click();
		  
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sortable")));
		  
		eventName = driver.findElement(By.id("eventName")).getText();
    hallName = driver.findElement(By.className("hall-cost")).getText().replace("Hall name:", "").trim();
  }

  
  @After
  public void tearDown() throws Exception 
  {
    driver.quit();

  }

  
  }