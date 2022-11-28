package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDealActions {

	public static void main(String[] args) throws InterruptedException {
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.snapdeal.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				WebElement ele = driver.findElement(By.xpath("//div[@class='leftNavWrapperRevamp']//li/a"));
				Actions builder = new Actions(driver);
				builder.moveToElement(ele).perform();
				
				driver.findElement(By.xpath("//span[text()='Shirts']")).click();
				driver.close();
	}

}
