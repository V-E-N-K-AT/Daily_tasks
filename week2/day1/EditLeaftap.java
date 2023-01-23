package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeaftap {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
        driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("xyz123");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Darun");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jayasoorya");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("DJ");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("testing");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("just cooking");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("xyz123@gmail.com");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("again testing the assignment"); 
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		// Duplicate Lead
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
	
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("abcCompany");
		
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ganesan");
		
		driver.findElement(By.className("smallSubmit")).click();
		
        String title2 = driver.getTitle();
		
		System.out.println(title2);
		
		
		
		
	

	}

}
