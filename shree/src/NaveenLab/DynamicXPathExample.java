package NaveenLab;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicXPathExample {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.get("https://www.ebay.com/");
		//driver.findElement(By.xpath("//select[@id='gh-cat']")).click();
		/*
		 * Select slect = new
		 * Select(driver.findElement(By.xpath("//select[@id='gh-cat']")));
		 * slect.selectByVisibleText("Baby");
		 *  List <WebElement>l = slect.getOptions();
		 * int size = l.size(); 
		 * for(int i =0; i<size ; i++){ 
		 * String options = l.get(i).getText(); 
		 * System.out.println(options); }
		 */
		 Thread.sleep(3000);
	      //driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Bag");
	     // driver.findElement(By.id("gh-ac")).sendKeys("Bag");
		 //driver.findElement(By.name("_nkw")).sendKeys("Bag");
		 //driver.findElement(By.cssSelector("#gh-ac")).sendKeys("Bag");
		 //driver.findElement(By.className("btn btn-prim gh-spr")).click();
		 //driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("Bag");
		//driver.findElement(By.xpath("//input[contains(@name,'_nkw')]")).sendKeys("Bag"); 
		 //driver.findElement(By.xpath("//a[contains(text(),'Advanced')]")).click();
		 //driver.findElement(By.xpath("//a[starts-with(text(),'Adv')]")).click();
		//driver.findElement(By.xpath("//a[ends-with(text(),'nced')]")).click();
		 //driver.findElement(By.xpath("//a[starts-with(@id,'gh-as-a')]")).click();
		
	      Thread.sleep(3000);
	      driver.quit();

	}

}
