package seleniumclass.dropdown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/SELENIUM/amol.html");
		driver.manage().window().maximize();
		WebElement multiSelect = driver.findElement(By.id("multiSel"));
		
		Select sl = new Select(multiSelect);
		Thread.sleep(4000);
		sl.selectByIndex(1);
		Thread.sleep(4000);
		sl.selectByVisibleText("text 3");
	
		/*List<WebElement> opt = sl.getOptions();
		Iterator it = opt.iterator();
		while(it.hasNext()) {
			 
			 WebElement wb = (WebElement)it.next();
			 System.out.println(wb.getText());
		 }  */


	}

}
