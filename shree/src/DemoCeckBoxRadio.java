import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCeckBoxRadio {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/SELENIUM/amol.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.id("check1")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("rad1")).click();
		
		
		
		
	}

}
