import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseAction3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
			WebElement source = null;
			WebElement target = null;
			WebDriver driver = new ChromeDriver();
			Actions act = new Actions(driver);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://demoapps.qspiders.com/ui?scenario=1");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
			Thread.sleep(2000);
			source = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
			target = driver.findElement(By.xpath("//div[@class='drop-column  min-h-[200px] bg-slate-100'][1]"));
			act.dragAndDrop(source, target).perform();
			Thread.sleep(2000);
			source = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
			act.dragAndDrop(source, target).perform();
			Thread.sleep(2000);
			source = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
			target = driver.findElement(By.xpath("//div[@class='drop-column min-h-[200px] bg-slate-100'][2]"));
			act.dragAndDrop(source, target).perform();
			Thread.sleep(2000);
			source = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
			act.dragAndDrop(source, target).perform();
			Thread.sleep(2000);
			driver.close();
	}

}
