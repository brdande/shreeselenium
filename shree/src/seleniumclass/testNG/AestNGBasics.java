package seleniumclass.testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AestNGBasics {
	/*
	 * Setup system properties for chrome
		Launch browser
	Login in to application
	Enter URL
	Google title test
	Log Out from app
	close browser
	delete all cookies
	 * 
	 * 
	 * 
	 */
	@BeforeSuite  // 1.
	  public void beforeSuite() {
		  System.out.println("1.Setup system properties for chrome");
		  
	  }
	 @BeforeTest //2.
	  public void beforeTest() {
		  System.out.println("2.Launch browser");
	  }

	@BeforeClass //3.
	  public void beforeClass() {
		  System.out.println("3.Login in to application");
	  }
	 @BeforeMethod  //4.
	  public void beforeMethod() {
		  System.out.println("4.Enter URL");
	  }
	 @BeforeMethod(enabled = false)  //4.
	  public void beforeMethod1() {
		  System.out.println("4.Enter URL duplicate");
	  }

  @Test //5.
  public void f() {
	  System.out.println("5.Google title test");
	  
  }
 
  
  @AfterMethod//6
  public void afterMethod() {
	  System.out.println("6.Log Out from app");
  }


  @AfterClass //7
  public void afterClass() {
	  System.out.println("7.close browser");
  }

 
  @AfterTest //8
  public void afterTest() {
	  System.out.println("8.delete all cokkies");
  }

  

  @AfterSuite //9
  public void afterSuite() {
	  System.out.println("9.close browser");
  }

}
