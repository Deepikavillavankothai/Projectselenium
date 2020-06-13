package educate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsorangehrm {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		//driver.findElement(By.id("menu_admin_UserManagement")).click();
//		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
	//	driver.findElement(By.id("searchSystemUser_userName")).sendKeys("fiona.grace");
//		driver.findElement(By.id("searchSystemUser_userType")).sendKeys("ESS");
	//	driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("Fiona Grace");
		//driver.findElement(By.id("searchSystemUser_status")).sendKeys("Enabled");
//		driver.findElement(By.xpath("//*[@id='searchBtn']")).click();
		

		

	}

}
