package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		//Setup browser driver
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		driver.get("https://www.facebook.com/");

		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click on Create New Account button
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//Enter all the details
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sridhar");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Raj");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sa@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'confirmation')]")).sendKeys("sa@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("Sridhar");
		
		//Select dob from drop down
		WebElement elmn = driver.findElement(By.xpath("//select[@id='month']"));
		Select emn = new Select(elmn);
		emn.selectByVisibleText("Apr");
		WebElement eldy = driver.findElement(By.xpath("//select[@id='day']"));
		Select emd = new Select(eldy);
		emd.selectByVisibleText("24");
		WebElement elyr = driver.findElement(By.xpath("//select[@id='year']"));
		Select ely = new Select(elyr);
		ely.selectByVisibleText("1986");
				
		//Select the Gender radio button
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.close();
	}

}
