package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		//Setup browser driver
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Enter the text and login
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on the CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
				
		//Click on the Leads link
		driver.findElement(By.linkText("Leads")).click();
				
		//Click on the Create Lead link
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter the details
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sridhar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sri");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Creating a lead form");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@gmail.com");
		
		//Select a value from State/Province drop down
		WebElement elestate = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select elst = new Select(elestate);		
		elst.selectByVisibleText("New York");
		
		//Click on submit button
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(2000);
		
		//Verify the title of the page
		System.out.println("The title is:"+ driver.getTitle());
		
		//Close the browser
		driver.close();
		
	}

}
