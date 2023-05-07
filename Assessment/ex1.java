package Assessment;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ex1 {
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
	  learningClass1 = driver.findElement(By.xpath("//*[@id=\"learning\"]/span")).getAttribute("class");
	  
	  isAssessmentPresent = driver.findElement(By.id("assessment")).isDisplayed();
	  assessmentClass1 = driver.findElement(By.xpath("//*[@id=\"assessment\"]/span")).getAttribute("class");
  
	  List<WebElement> rows = driver.findElements(By.tagName("tr"));
	  List<WebElement> col1 = driver.findElements(By.xpath("//*[@id=\"studentDetails\"]/tbody/tr[1]/th"));
	  
	  rowSize = rows.size();
	  colSize1 = col1.size();
	  
	  driver.findElement(By.id("learning")).click();
	  learningClass2 = driver.findElement(By.xpath("//*[@id=\"learning\"]/span")).getAttribute("class");
	  assessmentClass2 = driver.findElement(By.xpath("//*[@id=\"assessment\"]/span")).getAttribute("class");

	  Thread.sleep(500);
	  List<WebElement> columns2 = driver.findElements(By.xpath("//*[@id=\"studentDetails\"]/tbody/tr[1]/th"));
	  int count = colSize1;
	  for (int i = 0; i < columns2.size(); i ++) {
		  if(columns2.get(i).getAttribute("style").contains("display:none")) {
			  count--;
		  }
	  }
	  colSize2 = count;
	  
	  driver.findElement(By.id("assessment")).click();
	  learningClass3 = driver.findElement(By.xpath("//*[@id=\"learning\"]/span")).getAttribute("class");
	  assessmentClass3 = driver.findElement(By.xpath("//*[@id=\"assessment\"]/span")).getAttribute("class");
	  List<WebElement> columns3 = driver.findElements(By.xpath("//*[@id=\"studentDetails\"]/tbody/tr[1]/th"));
	   count = colSize1;
	  for (int i = 0; i < columns3.size(); i ++) {
		  if(columns3.get(i).getAttribute("style").contains("display:none")) {
			  count--;
		  }
	  }
	  colSize3 = count;
	  
	  driver.findElement(By.id("learning")).click();
	  learningClass4 = driver.findElement(By.xpath("//*[@id=\"learning\"]/span")).getAttribute("class");
	  assessmentClass4 = driver.findElement(By.xpath("//*[@id=\"assessment\"]/span")).getAttribute("class");
	  List<WebElement> columns4 = driver.findElements(By.xpath("//*[@id=\"studentDetails\"]/tbody/tr[1]/th"));
	   count = colSize1;
	  for (int i = 0; i < columns4.size(); i ++) {
		  if(columns4.get(i).getAttribute("style").contains("display:none")) {
			  count--;
		  }
	  }
	  colSize4 = count;
	  
//	  System.out.println(isLearningPresent + " " + isAssessmentPresent + "1" + learningClass1 + assessmentClass1 + "2" + learningClass2 + "2" + assessmentClass2);
//	  System.out.println(learningClass3 + "3" + assessmentClass3 + "4" + learningClass4  + assessmentClass4);
//	 
	  
  
  }

  @After
  public void tearDown() throws Exception {
	  //fill your code here
	  driver.quit();
  }
}

