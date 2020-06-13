package educate;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FirefoxScreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin"); 
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Linda Anderson");
		driver.findElement(By.id("empsearch_id")).sendKeys("0001");
			Select empsearch_employee_status = new Select(driver.findElement((By.id("empsearch_employee_status"))));
		empsearch_employee_status.selectByVisibleText("Full-Time Permanent");
		Select empsearch_termination = new Select(driver.findElement(By.id("empsearch_termination")));
		empsearch_termination.selectByVisibleText("Current Employees Only");
		driver.findElement(By.id("empsearch_supervisor_name")).sendKeys("John Smith");
		Select empsearch_job_title = new Select(driver.findElement(By.id("empsearch_job_title")));
		empsearch_job_title.selectByVisibleText("HR Manager");
		Select empsearch_sub_unit = new Select(driver.findElement(By.id("empsearch_sub_unit")));
		empsearch_sub_unit.selectByVisibleText("Administration");
        driver.findElement(By.xpath("//*[@id='searchBtn']")).click();
        TakesScreenshot ts =(TakesScreenshot)driver;
		   File source = ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(source,new File(("E:\\takescreen\\file.png")));

	}

}
