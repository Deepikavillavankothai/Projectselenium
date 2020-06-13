package educate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locatorsfirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("adc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("adc");
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		

	}

}
