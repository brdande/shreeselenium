package edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		WebElement loginId = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.name("pass"));
		WebElement login = driver.findElement(By.name("login"));
		ExplicitWaitExample.sendKays(driver, loginId, 10, "brdande@gmail.com");
		ExplicitWaitExample.sendKays(driver, password, 20, "abc");
		ExplicitWaitExample.clickOn(driver, login, 10);
		//Alert al = driver.switchTo().alert();
		//Thread.sleep(5000);
		//al.dismiss();
		
		
	}
	public static void sendKays(WebDriver driver1, WebElement element, int timeOut, String value ) {
		new WebDriverWait(driver1, timeOut).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
		
	}
	public static void clickOn(WebDriver driver1, WebElement element, int timeOut ) {
		new WebDriverWait(driver1, timeOut).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		
	}
}
