package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		//Setup browser driver
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Enter the details
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9894933045");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		String leadId=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).getText();
		System.out.println(leadId);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
		driver.findElement(By.xpath("//td[@class='x-btn-center']//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String msg=driver.findElement(By.xpath("//div[@class='x-toolbar x-small-editor']/div[@class='x-paging-info']")).getText();
		System.out.println(msg);
		if (msg.equals("No records to display")) {
			System.out.println("Deleted successfully");
		}
		else {
			System.out.println("Deletion Unsuccessful");
		}
		driver.close();
	}
	

}
