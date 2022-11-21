package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondtestCase {

	public static void main(String[] args) {
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
		WebElement accounts=driver.findElement(By.xpath("//a[@title='Accounts']"));
		driver.executeScript("arguments[0].click();", accounts);
		driver.findElement(By.xpath("//a[@title='New']")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Sridhar");
		String name = driver.findElement(By.xpath("//input[@name='Name']")).getAttribute("value");
		System.out.println(name);
		driver.findElement(By.xpath("//button[@aria-label='Ownership, --None--']")).click();
		driver.findElement(By.xpath("//span[@title='Public']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String addedName=driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println(addedName);
		if (addedName.contains(name)) {
			System.out.println("Account creation successful");
		}
		else {
			System.out.println("Account creation is not successful");
		}
		driver.close();
		driver1.close();

	}

}
