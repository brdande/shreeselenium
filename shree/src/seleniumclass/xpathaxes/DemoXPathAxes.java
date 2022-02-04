package seleniumclass.xpathaxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoXPathAxes {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://stock.scriptinglogic.net/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("admin"); 
		driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='submit' and @type='submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Add Customer']")).click();
		driver.findElement(By.xpath("//a[text()='View Customers']")).click();
		//self
		String text = driver.findElement(By.xpath("//td[normalize-space()='Amar']/self::td")).getText();
		System.out.println(text);
		//parent
		String text1 = driver.findElement(By.xpath("//tr/td[normalize-space()='Amar']/parent::tr")).getText();
		System.out.println(text1);
		//child
	    List<WebElement> child= driver.findElements(By.xpath("//td[normalize-space()='Amar']/parent::tr/child::td"));
	    System.out.println("Number of child elements"+child.size());
	    //Ancestor
	    List<WebElement> child1= driver.findElements(By.xpath("//td[normalize-space()='Amar']/ancestor::tbody/child::tr"));
	    System.out.println("Number of child elements"+child1.size());
		//descendant
	    List<WebElement> descendant = driver.findElements(By.xpath("//td[normalize-space()='Amar']/ancestor::tbody/descendant::tr"));
	   System.out.println("Number of descendant elements"+descendant.size());
	   //Following
	   List<WebElement> following = driver.findElements(By.xpath("//td[normalize-space()='Amar']/following::*"));
	   System.out.println("Number of following elements"+following.size());
	   //Preceding
	   List<WebElement> preceding = driver.findElements(By.xpath("//td[normalize-space()='Amar']/preceding::*"));
	   System.out.println("Number of Preceding elements"+preceding.size());
	 //Following-sibling
	   List<WebElement> followingSibling = driver.findElements(By.xpath("//td[normalize-space()='Amar']/following-sibling::td"));
	   System.out.println("Number of following-sibling elements"+followingSibling.size());
	 //Preceding-sibling
	   List<WebElement> precedingSibling = driver.findElements(By.xpath("//td[normalize-space()='Amar']/preceding-sibling::td"));
	   System.out.println("Number of following-sibling elements"+precedingSibling.size());
	   driver.close();
	}
}
