package edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcepts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		
		sendKeys(driver, driver.findElement(By.xpath("//input[@id='email']")), 10, "9922954840");
		sendKeys(driver, driver.findElement(By.xpath("//input[@id='pass']")), 10, "abc");
		clickOn(driver, driver.findElement(By.name("login")), 20);
	}
	
	public static void clickOn(WebDriver driver,WebElement locator, int timeouts) {
		new WebDriverWait(driver, timeouts).
		ignoring(StaleElementReferenceException.class).
		until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}
  public static void sendKeys(WebDriver driver,WebElement locator, int timeouts, String msg) {
	  new WebDriverWait(driver, timeouts).
		ignoring(StaleElementReferenceException.class).
		until(ExpectedConditions.elementToBeClickable(locator));
		locator.sendKeys(msg);
	  
  }
}
