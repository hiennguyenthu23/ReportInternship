package Assessment;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Ex1ver2 {
  public static WebDriver driver;
  public static String baseUrl="https://app.talentrank.in/uploads/10835-hide-show.html";
  public static boolean isLearningPresent = false;
  public static boolean isAssessmentPresent = false;
  public static String learningClass1,learningClass2,learningClass3,learningClass4,assessmentClass1,assessmentClass2,assessmentClass3,assessmentClass4;
  public static int rowSize, colSize1,colSize2,colSize3,colSize4;
  
  @Before
  public void setUp() throws Exception {
    //fill your code here
	  driver = new FirefoxDriver();
	  driver.get(baseUrl);
  }

  @Test
  public void testWeb() throws Exception {
	  //fill your code here
	  isLearningPresent = driver.findElement(By.id("learning")).isDisplayed();
	  Assert.assertTrue(isLearningPresent);
	  learningClass1 = driver.findElement(By.xpath("//*[@id=\"learning\"]/span")).getAttribute("class");
	  System.out.println(learningClass1);
	  isAssessmentPresent = driver.findElement(By.id("assessment")).isDisplayed();
	  assessmentClass1 = driver.findElement(By.xpath("//*[@id=\"assessment\"]/span")).getAttribute("class");
	  System.out.println(assessmentClass1);
	  
	  List<WebElement> rows = driver.findElements(By.cssSelector("#studentDetails > tbody > tr"));
	  rowSize = rows.size();
	  System.out.println(rowSize);
	  List<WebElement> column = driver.findElements(By.cssSelector("#studentDetails > tbody > tr:nth-child(1) > th"));
	  colSize1 = column.size();
	  System.out.println(colSize1);
	  
	  driver.findElement(By.id("learning")).click();
	  learningClass2 = driver.findElement(By.xpath("//*[@id=\"learning\"]/span")).getAttribute("class");
	  assessmentClass2 = driver.findElement(By.xpath("//*[@id=\"assessment\"]/span")).getAttribute("class");
	  
	  System.out.println(learningClass2 + " " + assessmentClass2);
	  colSize2 = column.size();
	  for (WebElement col : column) {
		  if (!col.isDisplayed()) {
			  colSize2--;
		  }
	  }
	  System.out.println(colSize2);
	  
	  
	  driver.findElement(By.id("assessment")).click();
	  learningClass3 = driver.findElement(By.xpath("//*[@id=\"learning\"]/span")).getAttribute("class");
	  assessmentClass3 = driver.findElement(By.xpath("//*[@id=\"assessment\"]/span")).getAttribute("class");
	  
	  System.out.println(learningClass3 + " " + assessmentClass3);
	  colSize3 = column.size();
	  for (WebElement col : column) {
		  if (!col.isDisplayed()) {
			  colSize3--;
		  }
	  }
	  System.out.println(colSize3);
	  
	  driver.findElement(By.id("learning")).click();
	  learningClass4 = driver.findElement(By.xpath("//*[@id=\"learning\"]/span")).getAttribute("class");
	  assessmentClass4 = driver.findElement(By.xpath("//*[@id=\"assessment\"]/span")).getAttribute("class");
	  
	  System.out.println(learningClass4 + " " + assessmentClass4);
	  colSize4 = column.size();
	  for (WebElement col : column) {
		  if (!col.isDisplayed()) {
			  colSize4--;
		  }
	  }
	  System.out.println(colSize4);
	  
  }

  @After
  public void tearDown() throws Exception {
	  //fill your code here
	  driver.quit();
  }
}

