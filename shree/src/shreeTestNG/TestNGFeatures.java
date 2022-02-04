package shreeTestNG;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
  @Test
  public void logInTest() {
	  System.out.println("Log in Test");
	  //int i=3/0;
  }
  
  @Test(dependsOnMethods ="logInTest")
  public void homePageTest() {
	  System.out.println("Home page in Test");
  }
  
  @Test(dependsOnMethods ="logInTest")
  public void searchPageTest() {
	  System.out.println("searchpage in Test");
  }
  
  @Test(priority = 1,dependsOnMethods ="logInTest")
  public void regPageTest() {
	  System.out.println("Registration page in Test");
  }
}
