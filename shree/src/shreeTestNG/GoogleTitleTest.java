package shreeTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	
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
	  public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println("Title of page =" + title);
		
		Assert.assertEquals(title,"Google","Title is not matched");
		//Assert.assertEquals(title,"Google12","Title is not matched");
		
		// It is just like if and else statement. if title is not matched it will print messsage.
	  }
	 @Test()
		public void googleTestLogo() {
			boolean b = driver.findElement(By.xpath("//input[@name = 'q']")).isDisplayed();
			System.out.println("Search text box disply = "+b);
			Assert.assertTrue(b);
			Assert.assertEquals(b,true);
			
			
			
		}
	 @AfterMethod
	  public void afterMethod() {
		  driver.quit();
	  }

}
