package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadUsingXpath {

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
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		//Click on the CRM/SFA link
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
				
		//Click on the Leads link
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
				
		//Click on the Create Lead link
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		
		//Enter the details
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("CTS");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Sridhar");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Rajan");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Sri");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("IT");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Creating a lead form");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("test@gmail.com");
		
		//Select a value from State/Province drop down
		WebElement elestate = driver.findElement(By.xpath("//Select[@name='generalStateProvinceGeoId']"));
		Select elst = new Select(elestate);		
		elst.selectByVisibleText("New York");
		
		//Click on submit button
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		Thread.sleep(2000);
		
		String str1= driver.findElement(By.xpath("(//div[@id='myLeads']//td[@tabindex=0])[1]")).getText();
		System.out.println(str1);
		//Verify the title of the page
		System.out.println("The title is:"+ driver.getTitle());
		
		//Close the browser
		driver.close();

	}

}
