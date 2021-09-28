package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
        
        Alert alert=driver.switchTo().alert();
        String alertmessage=driver.switchTo().alert().getText();
        System.out.println(alertmessage);
        
        alert.accept();
        //alertwithok and cancel
        driver.findElement(By.xpath("//*@href='CancelTab']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Alert alerttone=driver.SwitchTo().alert();
        String alertmessage=driver.switchTo().alert().getText();
        System.out.println(alertmessage);
        
	} 
	

}
