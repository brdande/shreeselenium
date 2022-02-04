package seleniumclass;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/SELENIUM/amol.html");
		driver.manage().window().maximize();
		WebElement dropDown = driver.findElement(By.id("seltext"));
		
		Select sl = new Select(dropDown);
		Thread.sleep(1300);
		sl.selectByVisibleText("text 4");
		List<WebElement> opt = sl.getOptions();
		Iterator it = opt.iterator();
		while(it.hasNext()) {
			 
			 WebElement wb = (WebElement)it.next();
			 System.out.println(wb.getText());
		 }


	}

}
