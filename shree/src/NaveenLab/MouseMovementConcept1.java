package NaveenLab;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept1 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.get("https://www.guru99.com/keyboard-mouse-events-files-webdriver.html");
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Testing')]"))).build().perform();
		Thread.sleep(5000);
		//driver.findElement(By.id("menu-item-4569")).click();
		//Thread.sleep(5000);
		//driver.quit();
	}

}
