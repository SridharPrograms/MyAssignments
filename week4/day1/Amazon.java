package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		//Setup browser driver
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		driver.get("https://www.amazon.in");

		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro",Keys.ENTER);
		Thread.sleep(2000);
		String fstprice=driver.findElement(By.className("a-price-whole")).getText();
		System.out.println("The price of 1st listed product is: " + fstprice);
		String fstrtng=driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
		System.out.println("The price of 1st listed product is: " + fstrtng);
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		Thread.sleep(2000);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/OnePlus.png");
		FileUtils.copyFile(source, dest);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(3000);
		String crtpce=driver.findElement(By.id("attach-accessory-cart-subtotal")).getText();
		System.out.println("The Cart Subtotal is: " + crtpce);
		if (crtpce.contains(fstprice)) {
			System.out.println("Price is Matching");
		}
		else {
			System.out.println("Price is Not Matching");
		}
		driver.close();
	}
}
