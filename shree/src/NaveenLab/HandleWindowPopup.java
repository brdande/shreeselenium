package NaveenLab;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopup {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.get("http://demo.guru99.com/popup.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		Thread.sleep(2000);
		  Set <String> handler = driver.getWindowHandles();	
		  
		  Iterator <String> it = handler.iterator();
		  
		  String parentId = it.next();
		  System.out.println("Main window ID"+parentId);
		  
		  String childId = it.next();
		  System.out.println("Child window ID"+childId);
		  
	       driver.switchTo().window(childId);
		  System.out.println("Child window pop title"+driver.getTitle());
		  
		  driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("br@gmail.com");
		  Thread.sleep(2000);
		  driver.close();
		  
		  driver.switchTo().window(parentId);
		  System.out.println("Parent window "+driver.getTitle());
		  

	}

}
