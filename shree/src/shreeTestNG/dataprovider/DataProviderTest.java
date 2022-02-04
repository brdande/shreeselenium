package shreeTestNG.dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	WebDriver driver;
	@BeforeMethod
	  public void setUp() {
		  
		    System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.google.com/");
	  }
  @Test
  public void regestrationPageTEst() {
	  
	  
  }
  @DataProvider
  public void getTestData() {
	  
  }
  @AfterMethod
  public void tearDown() {
	  driver.quit();
  }
}
