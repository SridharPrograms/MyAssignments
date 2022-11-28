package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnListAmazon {

	public static void main(String[] args) throws InterruptedException {
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
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phones",Keys.ENTER);
		
		 List <WebElement> allprice=driver.findElements(By.className("a-price-whole"));
		 List <Integer> fprice = new ArrayList<Integer>();
		 
		 for (int i=0; i<allprice.size();i++) {
			 WebElement price = allprice.get(i);
			 String mprice = price.getText().replace(",","");
			 System.out.println(mprice);
			 int finalprice = Integer.parseInt(mprice);
			 fprice.add(finalprice);
			 
		 }
		 Collections.sort(fprice);
		 System.out.println("The least mobile price is: " + fprice.get(0));
	}

}
