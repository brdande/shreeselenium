package seleniumclass.dropdown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://stock.scriptinglogic.net/");
		driver.manage().window().maximize();
		
		List<WebElement> ls = driver.findElements(By.tagName("input"));
		System.out.println(ls.size());
		 Iterator it = ls.iterator();
		 
		 while(it.hasNext()) {
			 
			 WebElement wb = (WebElement)it.next();
			 System.out.println(wb.getText());
		 }

	}

}
