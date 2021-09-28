package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("\"https://opensource-demo.orangehrmlive.com/\");");
        driver.manage().window().maximize();
        
        //implicit wait
        
 
        driver.findElement(By.id("Email")).sendKeys("rekhabr1@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("rekhab");
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        
        WebDriverWait Mywait=new WebDriverWait(driver,10);
        Mywait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("log out")));
        driver.findElement(By.linkText("Log out")).click();
        driver.close();
	}

}
