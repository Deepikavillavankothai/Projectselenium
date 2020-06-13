package educate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.guru99.com/selenium-tutorial.html");
		
		driver.navigate().back();
		System.out.println("back done");
		
		driver.navigate().forward();
		System.out.println("forward done");
		driver.navigate().refresh();
		System.out.println("refresh done");
	}

}
