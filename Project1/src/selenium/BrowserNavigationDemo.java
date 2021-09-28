package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@href='/register']")).click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().to("http://demowebshop.tricentis.com/");
        driver.navigate().refresh();
	}

}
