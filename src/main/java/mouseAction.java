import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseAction {

	public static void main(String[] args) throws Exception
	
	{
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//span[text()='Login']"));
		act.click(ele).perform();
		Thread.sleep(3000);
		Boolean b = driver.findElement(By.xpath("//span[text()='Login']")).isDisplayed();
		System.out.println("Login page verified : " +b);
	}

}
