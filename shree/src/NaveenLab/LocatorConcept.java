package NaveenLab;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
		
		//1. xpath finding element by xpath
		// absoulte xpath should not be used
		// relative xpath should be used
		
		
		/*driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Balaji");  
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Dande"); 
		*/
		// 2. id
		/*driver.findElement(By.id("firstname")).sendKeys("Balaji");  
				
		driver.findElement(By.id("lastname")).sendKeys("Dande");*/
		
		//3. name
		/*driver.findElement(By.name("firstname")).sendKeys("Balaji");  
		
		driver.findElement(By.name("lastname")).sendKeys("Dande");*/
		
		// 4. link
		//driver.findElement(By.linkText("Sign in")).click();
		
		//5.partialLinkText
		//driver.findElement(By.partialLinkText("in")).click();
		
		//6. CSSSelector
		//if id is there use #id
		// if class is there use .class 
		//driver.findElement(By.cssSelector("#Email")).sendKeys("brd@gmail.com");
		
		driver.findElement(By.cssSelector(".action-link")).click();
		//7. class
		//driver.findElement(By.className("action-link")).click();
		
		//
		
		}

}
