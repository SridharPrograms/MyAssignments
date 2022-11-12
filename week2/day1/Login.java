package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

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
		
		//Select from drop-down for Source
		WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select eledd = new Select(eleSource);
		eledd.selectByValue("LEAD_CONFERENCE");
		
		driver.findElement(By.name("submitButton")).click();
		
		//Logout
		Thread.sleep(2000);
		driver.close();

	}

}
