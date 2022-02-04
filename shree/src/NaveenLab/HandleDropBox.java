package NaveenLab;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class HandleDropBox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.get("https://www.ebay.com/");
		
		Select select = new Select(driver.findElement(By.id("gh-cat")));
		select.selectByVisibleText("Art");
		
		List l = select.getOptions();
		for (Iterator iterator = l.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			
		}
		
		System.out.println(l.get(0).toString());
		
}
}
