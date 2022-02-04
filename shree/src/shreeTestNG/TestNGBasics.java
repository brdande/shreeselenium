package shreeTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGBasics {
	/*
	 * Setup system properties for chrome
		Launch browser
	Login in to application
	Enter URL
	Google title test
	Log Out from app
	close browser
	delete all cokkies
	 * 
	 * 
	 * 
	 */
	@BeforeSuite  // 1.
	  public void beforeSuite() {
		  System.out.println("Setup system properties for chrome");
		  
	  }
	 @BeforeTest //2.
	  public void beforeTest() {
		  System.out.println("Launch browser");
	  }

	@BeforeClass //3.
	  public void beforeClass() {
		  System.out.println("Login in to application");
	  }
	 @BeforeMethod  //4.
	  public void beforeMethod() {
		  System.out.println("Enter URL");
	  }
	
  @Test //5.
  public void f() {
	  System.out.println("Google title test");
	  
  }
 
  
  @AfterMethod//6
  public void afterMethod() {
	  System.out.println("Log Out from app");
  }


  @AfterClass //7
  public void afterClass() {
	  System.out.println("close browser");
  }

 
  @AfterTest //8
  public void afterTest() {
	  System.out.println("delete all cokkies");
  }

  

  @AfterSuite //9
  public void afterSuite() {
	  System.out.println("close browser");
  }

}
