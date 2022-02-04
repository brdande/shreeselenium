package NaveenLab;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		List <WebElement> listElements = driver.findElements(By.tagName("iframe"));
		System.out.println("Total No of Links present on the page "+listElements.size());
		//System.out.println(listElements.get(0).getTagName());
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"))).build().perform();
		driver.findElement(By.xpath("//span[@class='nav-text']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Your Idea Lists')]")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
