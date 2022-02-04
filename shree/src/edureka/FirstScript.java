package edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
	/**
	 * @param arg
	 * @throws InterruptedException
	 */
	public static void main (String arg[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("poco c3");
		Thread.sleep(4000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("Redmi")).click();
		//Thread.sleep(20000);
		
/*		System.setProperty("webdriver.chrome.driver", "D//:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");  
        
        // Instantiate a ChromeDriver class.     
   WebDriver driver=new ChromeDriver();  
     
      // Launch Website  
   driver.navigate().to("http://www.javatpoint.com/");  
     
    //Maximize the browser  
     driver.manage().window().maximize();  
     
     //Scroll down the webpage by 5000 pixels  
 
     
    // Click on the Search button  
   driver.findElement(By.linkText("Core Java")).click();  
		
		
	}*/

}
}
