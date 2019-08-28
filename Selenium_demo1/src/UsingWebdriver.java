import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsingWebdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver","D:\\selenium_Id_demo\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = "https://accounts.google.com/signin";
		driver.get(url);
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		WebElement email_phone = driver.findElement(By.xpath("//input[@id='identifierId']"));
		email_phone.sendKeys("ramaspol11@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		//WebElement password = driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']"));
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
				
		wait.until(ExpectedConditions.elementToBeClickable(password));
		
		password.sendKeys("12345");
		driver.findElement(By.id("passwordNext")).click();
		
		//driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		//Close the browser.
		//driver.close();

		
	}

}
