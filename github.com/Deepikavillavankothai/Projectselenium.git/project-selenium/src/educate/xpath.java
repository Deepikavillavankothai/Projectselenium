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

public class xpath {

	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		//absolute xpath
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[1]/input")).sendKeys("adc");
		//relative xpath
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("adc");
	//and condition
		driver.findElement(By.xpath("//*[@id='u_0_m' and @name='firstname']")).sendKeys("sita");
		//or condition
		driver.findElement(By.xpath("//*[@id='u_0_o' or @name='lastname']")).sendKeys("ram");
		//directly writing xpath
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7654832176");
		//contains xpath
		driver.findElement(By.xpath("//*[contains(@name,'reg_passwd__')]")).sendKeys("adcf");
		//starts with xpath
		driver.findElement(By.xpath("//input[starts-with(@name,'sex')]")).click();
		TakesScreenshot ts =(TakesScreenshot)driver;
	       File source = ts.getScreenshotAs(OutputType.FILE);
	       FileUtils.copyFile(source,new File(("E:\\takescreen\\file.png")));



	}

}
