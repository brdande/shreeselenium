package junitexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginJunit {


    WebDriver driver;

    @Before // method below this annotation will run before every test method
    public void openBrowser()
    {
    	System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @After // method below this annotation will run after every test method
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
    }

    @Test
    public void myTest1() {

        driver.get("http://stock.scriptinglogic.net");
        driver.findElement(By.cssSelector("#login-username")).sendKeys("admin"); // #login-username
        driver.findElement(By.cssSelector("#login-password")).sendKeys("admin"); // #login-password
       // driver.findElement(By.cssSelector(".blue")).click(); // .blue

    }

    @Test
    public void myTest2() {

        driver.get("http://stock.scriptinglogic.net");
        driver.findElement(By.cssSelector("#login-username")).sendKeys("545"); // #login-username
        driver.findElement(By.cssSelector("#login-password")).sendKeys("dsds"); // #login-password
       // driver.findElement(By.cssSelector(".blue")).click(); // .blue

    }

    @Test
    public void myTest3() {

        driver.get("http://stock.scriptinglogic.net");
        driver.findElement(By.cssSelector("#login-username")).sendKeys(""); // #login-username
        driver.findElement(By.cssSelector("#login-password")).sendKeys(""); // #login-password
       // driver.findElement(By.cssSelector(".blue")).click(); // .blue
        Assert.assertEquals(3,4,"Wrong input");

    }
}