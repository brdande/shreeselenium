package edureka;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcepts {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.get("https://www.ebay.com/");
		
		
		//1.Get the total count of links on the page
		//2. Get the link text of each link text on the page
		List <WebElement> listElements = driver.findElements(By.tagName("a"));
		System.out.println("Total No of Links present on the page "+listElements.size());
		int count = 0;
		for (Iterator iterator = listElements.iterator(); iterator.hasNext();) {
			WebElement webElement = (WebElement) iterator.next();
			String linkText =webElement.getText();
			
			if(!linkText.equals("")) {
				count ++;
				System.out.println(linkText);
			
			}
		}
		
		System.out.println("Total No of visible Links present on the page "+count);
	}

}
