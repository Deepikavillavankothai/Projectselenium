package educate;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
   Select day= new Select(driver.findElement(By.id("day")));
   day.selectByIndex(10);
   Select month= new Select(driver.findElement(By.id("month")));
   month.selectByVisibleText("Nov");
   Select year=new Select(driver.findElement(By.id("year")));
   year.selectByValue("1996");;
   TakesScreenshot ts =(TakesScreenshot)driver;
   File source = ts.getScreenshotAs(OutputType.FILE);
   FileUtils.copyFile(source,new File(("E:\\takescreen\\file.png")));

	}

}
