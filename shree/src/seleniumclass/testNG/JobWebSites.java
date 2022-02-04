package seleniumclass.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JobWebSites {
	WebDriver driver;
	
	
	@BeforeSuite  // 1.
	  public void aeforeSuite() {
		  System.out.println("Called Before Suite");
		  
	  }
	
	 @BeforeTest //2.
	  public void beforeTest() {
		  System.out.println("Called Before Test");
	  }
	 @BeforeClass //3.
	  public void beforeClass() {
		  System.out.println("Called Before class");
	  }
	@BeforeMethod //4
	public void openWebBrowser() {
		System.out.println("BeforeMethod");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
  @Test
  public void jobWebSiteOne() {
	  
	    System.out.println("jobWebSiteOne Method");
	  
  }
  @Test(enabled = false) // To skip the test
  public void jobWebSiteTwo() {
	  
	    System.out.println("jobWebSite   two  Method");
	  
  }
  @AfterMethod
  public void closeWebBrowser() throws InterruptedException {
	  System.out.println("After Method");
	  Thread.sleep(4000);
	  driver.close();
  }
  @AfterClass //7
  public void afterClass() {
	  System.out.println("Called After class");
  }

  @AfterTest //8
  public void afterTest() {
	  System.out.println("Called After Test");
  }
  @AfterSuite //9
  public void afterSuite() {
	  System.out.println("Called After Suite");
  }
}
