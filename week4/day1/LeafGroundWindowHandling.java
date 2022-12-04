package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();            
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ssnceyfd5mtq1u38yu3inp0zh436503.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("j_idt88:new")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles);
		System.out.println("Number of opened Tabs= "+windows.size());
		driver.switchTo().window(windows.get(0));
		driver.findElement(By.id("j_idt88:j_idt91")).click();
		windowHandles=driver.getWindowHandles();
		windows= new ArrayList<String>(windowHandles);
		System.out.println("Number of opened Tabs= "+windows.size());
		driver.findElement(By.id("j_idt88:j_idt93")).click();
		windowHandles=driver.getWindowHandles();
		windows= new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1)).close();
		driver.switchTo().window(windows.get(2)).close();
		driver.switchTo().window(windows.get(3)).close();
		driver.switchTo().window(windows.get(4)).close();
		driver.switchTo().window(windows.get(5)).close();
		driver.switchTo().window(windows.get(6)).close();
		driver.switchTo().window(windows.get(0));
		driver.findElement(By.id("j_idt88:j_idt95")).click();
		Thread.sleep(3000);
		windowHandles = driver.getWindowHandles();
		windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1)).close();
		driver.switchTo().window(windows.get(2)).close();
		driver.close();
	}

}
