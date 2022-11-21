package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		//Setup browser driver
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		driver.get("https://login.salesforce.com");

		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver1=new ChromeDriver(ch);
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Login
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement oppur=driver.findElement(By.xpath("//a[@title='Opportunities']"));
		driver.executeScript("arguments[0].click();", oppur);
		driver.findElement(By.xpath("//a[@title='New']")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by sridhar");
		String name = driver.findElement(By.xpath("//input[@name='Name']")).getAttribute("value");
		System.out.println(name);
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//button[@name='today']")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input-value')]")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String addedName=driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println(addedName);
		if (addedName.contains(name)) {
			System.out.println("Oppurtunity name is Matching");
		}
		else {
			System.out.println("Oppurtunity name is Not Matching");
		}
		driver.close();
		driver1.close();
	}

}
