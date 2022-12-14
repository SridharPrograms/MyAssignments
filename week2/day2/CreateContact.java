package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//Launch Url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Maximize the browser Window
		 driver.manage().window().maximize();	
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Sri");
		driver.findElement(By.id("lastNameField")).sendKeys("Raj");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Sri");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Raj");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Description");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("sa2@gmail.com");
		WebElement element1 = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd = new Select(element1);
		dd.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement updateele = driver.findElement(By.id("updateContactForm_description"));
		updateele.clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Reach the Helpdesk");
		driver.findElement(By.xpath("//input[@value='Update']"));
		
		//getTitle
		 System.out.println("Title of Resulting Page: " +driver.getTitle());
		 
		driver.close();

	}

}
