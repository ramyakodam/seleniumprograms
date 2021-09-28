package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","D:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("http://demowebshop.tricentis.com/Register");
	        driver.manage().window().maximize();
     
	        driver.findElement(By.id("gender-female")).click();
	        driver.findElement(By.name("FirstName")).sendKeys("varshith");
	        driver.findElement(By.name("LastName")).sendKeys("kodam");
	        driver.findElement(By.id("Email")).sendKeys("varshithkodam56@gmail.com");
	        driver.findElement(By.name("Password")).sendKeys("varshith512");
	        driver.findElement(By.name("ConfirmPassword")).sendKeys("varshith512");
	        driver.findElement(By.id("register-button")).click();
	        driver.findElement(By.xpath("//input[@value='Continue']")).click();
	        
	}

}
