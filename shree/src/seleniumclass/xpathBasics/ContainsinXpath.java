package seleniumclass.xpathBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsinXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains (text(),'Fashion')]")).click();
		//driver.findElement(By.xpath("//img[@alt ='Top banner']")).click();
		driver.findElement(By.xpath("//img[contains (@alt ,'Top banner')]")).click();

	}

}
