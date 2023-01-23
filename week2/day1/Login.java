package week2.day1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Login {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize(); 
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		
	/*	WebElement userentry = driver.findElement(By.id("username"));
		userentry.sendKeys("DemoCSR");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("xyz123");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Darun");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jayasoorya");
		
		//driver.findElement(By.className("smallSubmit")).click();
		
		WebElement val = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select dd = new Select(val);
		
		dd.selectByValue("LEAD_CONFERENCE"); */


	}

}
