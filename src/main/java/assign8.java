import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assign8 {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//span[text()='Electronics']"));
		act.click(ele).perform();
		Thread.sleep(3000);
		ele = driver.findElement(By.xpath("//span[text()='Men']"));
		act.click(ele).perform();
		Thread.sleep(3000);
		ele = driver.findElement(By.xpath("//span[text()='Men']/..//span[text()='Electronics']"));
		act.click(ele).perform();
		Thread.sleep(3000);
		driver.close();
	}

}
