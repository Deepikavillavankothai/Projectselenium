package educate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("adc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("adc");
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
	}

}
