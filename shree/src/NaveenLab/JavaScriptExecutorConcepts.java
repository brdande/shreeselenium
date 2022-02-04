package NaveenLab;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScriptExecutorConcepts {

	public static void main(String[] args)throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9922954840");
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abc");
		WebElement webelementpasswor = driver.findElement(By.xpath("//input[@id='pass']"));
		webelementpasswor.sendKeys("abc");
		
		/*WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		flash(login,driver);// highlight element
		drawBorder(login,driver); // element border
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE );
		FileUtils.copyFile(src, new File("C:\\Users\\Admin\\eclipse-workspace\\shree\\src\\NaveenLab\\element.png"));
		generateAlert(driver,"There is an issue wiht login button of login page");
		
		// you can use switchTo method to accept or dissmiss alert.
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		
		System.out.println(alert.getText());
		alert.accept();
		*/
		/*clickElementByJS(login, driver); // click login button by JS
		
		 there are two ways to refersh the browser
		//1. by using nevigate method of driver class
		   driver.navigate().refresh();
		// 2. By using JavaScriptExecutor  
		   refreshBrowserByJS(driver);
		   
		   System.out.println("page title by JS ="+getTitleByJS(driver));
		   System.out.println("page Page Inner Text by JS ="+getPageInnerText(driver));
		   */
		  // scrollPageDown(driver);
		Thread.sleep(2000);
		   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Terms')]"));
		   scrollIntoView(driver,element1);
				   
				   
				   
				  
		
	}
	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor jse = ((JavascriptExecutor)driver);
		String bgcolor = element.getCssValue("backgroundColor");
	System.out.println(bgcolor);
		for (int i = 0; i < 10; i++) {
			changeColor("rgb(0,200,0)",element,driver);
			changeColor(bgcolor,element,driver);
		}
			
		
		
	}
  public static void changeColor(String color,WebElement element, WebDriver driver ) {
	  JavascriptExecutor jse = ((JavascriptExecutor)driver);
	  jse.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
	  try {
		  Thread.sleep(20);
	  }catch(InterruptedException ie) {
		  
	  }
  }
  
  public static void drawBorder(WebElement element, WebDriver driver) {
	    JavascriptExecutor js = ((JavascriptExecutor)driver);
	    js.executeScript("arguments[0].style.border='3px solid red'", element);
	}

  public static void generateAlert(WebDriver driver, String message) {
	  JavascriptExecutor js = ((JavascriptExecutor)driver);
	    js.executeScript("alert('"+message+"')");
  }

  public static void clickElementByJS(WebElement element, WebDriver driver) {
	  JavascriptExecutor js = ((JavascriptExecutor)driver);
	  js.executeScript("arguments[0].click();",element);
  }
  
  public static void refreshBrowserByJS(WebDriver driver) {
	  JavascriptExecutor js = ((JavascriptExecutor)driver);
	  js.executeScript("history.go(0)");
	  
  }
  public static String getTitleByJS(WebDriver driver) {
	  JavascriptExecutor js = ((JavascriptExecutor)driver);
	  String title= js.executeScript("return document.title").toString();
	  return title;
  }
  
  public static String getPageInnerText(WebDriver driver) {
	  JavascriptExecutor js = ((JavascriptExecutor)driver);
	  String pageText = js.executeScript("return document.documentElement.innerText").toString();
	  return pageText;
  }
  
  public static void scrollPageDown(WebDriver driver) {
	  JavascriptExecutor js = ((JavascriptExecutor)driver);
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
  }
  public static void scrollIntoView(WebDriver driver,WebElement element) {
	  JavascriptExecutor js = ((JavascriptExecutor)driver);
	  js.executeScript("arguments[0].scrollIntoView(true);",element);
  }
}
