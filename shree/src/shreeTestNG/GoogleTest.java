package shreeTestNG;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class GoogleTest {
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
	@Test(priority = 1,groups = "Title")
	  public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println("Title of page " + title);
	  }
	@Test(priority = 3,groups = "Logo")
	public void googleTestLogo() {
		boolean b = driver.findElement(By.xpath("//input[@name = 'q']")).isDisplayed();
		System.out.println("Search text box disply = "+b);
	}
	
	@Test(priority = 2,groups = "Link")
	public void gmailLink() {
		boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println("Is gmail diaplyed = "+b);
	}
	
	@Test(priority = 4,groups = "Test")
	public void test1() {
		System.out.println("test1");
	}
	@Test(priority = 5,groups = "Test")
	public void test2() {
		System.out.println("test2");
	}
	@Test(priority = 6,groups = "Test")
	public void test3() {
		System.out.println("test3");
	}
	
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

 

}
