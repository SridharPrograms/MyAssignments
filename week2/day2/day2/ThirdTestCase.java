package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThirdTestCase {

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
		WebElement act=driver.findElement(By.xpath("//span[text()='Global Actions']"));
		driver.executeScript("arguments[0].click();", act);
		driver.findElement(By.xpath("//a[@title='New Task']")).click();
		driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']")).sendKeys("Bootcamp");
		driver.findElement(By.xpath("//div[@class='uiPopupTrigger']//a[text()='Not Started']")).click();
		driver.findElement(By.xpath("//a[text()='Waiting on someone else']")).click();
		WebElement sav=driver.findElement(By.xpath("//span[text()='Save']"));
		driver.executeScript("arguments[0].click();", sav);
		String captureMsg=driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println(captureMsg);
		
		driver.close();
		driver1.close();
	}

}
